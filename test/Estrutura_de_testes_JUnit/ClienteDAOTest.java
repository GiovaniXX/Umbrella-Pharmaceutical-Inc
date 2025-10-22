package Estrutura_de_testes_JUnit;

import java.sql.Connection;
import java.sql.Statement;

import dao.ClienteDAO;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import model.Cliente;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.junit.BeforeClass;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import util.Conexao;

public class ClienteDAOTest {

    private ClienteDAO clienteDAO;
    private JTable tabela;

    @BeforeClass
    public static void setUpClass() throws Exception {
        Connection conn = Conexao.getConnection();
        Statement stmt = conn.createStatement();

        stmt.execute("""
        CREATE TABLE clientes (
            idcliente INT PRIMARY KEY,
            nome VARCHAR(100),
            sobrenome VARCHAR(100),
            email VARCHAR(100),
            endereco VARCHAR(100),
            telefone VARCHAR(20),
            idcidade INT,
            dataCadastro DATE,
            cidade VARCHAR(100)
        )
        """);

        stmt.execute("""
        INSERT INTO clientes (
        idcliente, nome, sobrenome, email, endereco, telefone, idcidade, dataCadastro, cidade
        ) VALUES (
        1, 'Teste', 'Silva', 'teste@email.com', 'Rua A, 123', '99999-9999', 1, CURRENT_DATE, 'Cidade'
        )
        """);

        stmt.close();
        conn.close();
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
        Connection conn = Conexao.getConnection();
        Statement stmt = conn.createStatement();
        stmt.execute("DROP TABLE clientes");
        stmt.close();
        conn.close();
    }

    @Before
    public void setUp() {
        clienteDAO = new ClienteDAO();
        tabela = new JTable();
    }

    @After
    public void tearDown() {
        // Executado após cada teste
    }

    @Test
    public void testEditarClienteAtualizaTabela() {
        // 1. Buscar cliente existente
        Cliente cliente = clienteDAO.buscarPorId(1); // supondo que o ID 1 existe
        assertNotNull(cliente);

        // 2. Alterar dados
        cliente.setNome("Novo Nome");
        cliente.setCidade("Nova Cidade");
        cliente.setDataCadastro(new java.util.Date());

        // 3. Atualizar no banco
        String atualizado = clienteDAO.editarCliente(cliente);
        assertEquals("Cliente editado com sucesso", atualizado);

        // 4. Buscar novamente e verificar
        Cliente atualizadoCliente = clienteDAO.buscarPorId(1);
        assertEquals("Novo Nome", atualizadoCliente.getNome());
        assertEquals("Nova Cidade", atualizadoCliente.getCidade());

        // 5. Preencher tabela visual
        List<Cliente> lista = clienteDAO.listarClientes();
        DefaultTableModel modelo = new DefaultTableModel(new Object[]{"ID", "Nome", "Cidade"}, 0);
        for (Cliente c : lista) {
            modelo.addRow(new Object[]{c.getIdCliente(), c.getNome(), c.getCidade()});
        }
        tabela.setModel(modelo);

        // 6. Verificar se a tabela contém os dados atualizados
        boolean encontrado = false;
        for (int i = 0; i < tabela.getRowCount(); i++) {
            if (tabela.getValueAt(i, 0).equals(1)) {
                assertEquals("Novo Nome", tabela.getValueAt(i, 1));
                assertEquals("Nova Cidade", tabela.getValueAt(i, 2));
                encontrado = true;
                break;
            }
        }
        assertTrue(encontrado);
    }
}
