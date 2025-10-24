package Estrutura_de_testes_JUnit_4;

import dao.UsuarioDAO;
import model.Usuario;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import static org.junit.Assert.*;

public class UsuarioDAOTest {

    private UsuarioDAO dao;

    @Before
    public void setUp() throws Exception {
        dao = new UsuarioDAO();
        try (Connection conn = DriverManager.getConnection("jdbc:h2:mem:testdb;DB_CLOSE_DELAY=-1", "sa", ""); Statement stmt = conn.createStatement()) {
            stmt.execute("DROP TABLE IF EXISTS usuarios");
            stmt.execute("CREATE TABLE usuarios ("
                    + "idUsuario INT PRIMARY KEY,"
                    + "nome VARCHAR(100),"
                    + "sobrenome VARCHAR(100),"
                    + "usuario VARCHAR(100),"
                    + "senha VARCHAR(50),"
                    + "chave VARCHAR(100),"
                    + "perfil INT)");
        }
    }

    @After
    public void tearDown() throws Exception {
        // Limpa a tabela após cada teste
        try (Connection conn = DriverManager.getConnection("jdbc:h2:mem:testdb;DB_CLOSE_DELAY=-1", "sa", ""); Statement stmt = conn.createStatement()) {
            stmt.execute("DELETE FROM usuarios");
        }
    }

    @Test
    public void testInserirUsuario() {
        Usuario usuario = new Usuario(
                1,
                "João",
                "Silva",
                "joaosilva",
                "senha123",
                "chaveABC",
                1
        );

        String resultado = dao.adicionarUsuario(usuario);
        assertEquals("Usuário cadastrado com sucesso!", resultado);

        boolean validado = dao.validarUsuario("joaosilva", "senha123", "chaveABC");
        assertTrue(validado);
    }
}
