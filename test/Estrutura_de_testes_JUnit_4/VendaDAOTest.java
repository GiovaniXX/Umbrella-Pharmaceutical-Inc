package Estrutura_de_testes_JUnit_4;

import dao.VendaDAO;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import model.ItemVenda;

import static org.junit.Assert.*;

public class VendaDAOTest {

    private Connection conn;
    private VendaDAO dao;

    @Before
    public void setUp() throws Exception {
        conn = DriverManager.getConnection("jdbc:h2:mem:testdb;DB_CLOSE_DELAY=-1", "sa", "");
        dao = new VendaDAO(conn);

        try (Statement stmt = conn.createStatement()) {
            stmt.execute("CREATE TABLE clientes (idCliente INT PRIMARY KEY, nome VARCHAR(100))");
            stmt.execute("CREATE TABLE produtos (idProduto INT PRIMARY KEY, produto VARCHAR(100), descricao VARCHAR(255), preco DECIMAL(10,2))");

            stmt.execute("CREATE TABLE vendas (idVenda INT AUTO_INCREMENT PRIMARY KEY, dataVenda TIMESTAMP, idCliente INT, idUsuario INT, numeroVenda INT, valorTotal DECIMAL(10,2), quantidadeTotal INT)");

            stmt.execute("CREATE TABLE itemvenda (idItemVenda INT AUTO_INCREMENT PRIMARY KEY, idVenda INT, idProduto INT, quantidade INT, precoUnitario DECIMAL(10,2))");
        }
    }

    @After
    public void tearDown() throws Exception {
        if (conn != null && !conn.isClosed()) {
            try (Statement stmt = conn.createStatement()) {
                stmt.execute("DROP ALL OBJECTS");
            }
            conn.close();
        }
    }

    @Test
    public void testSalvarVendaEItem() throws SQLException {
        int numeroVenda = 1;
        int idCliente = 1;
        int idProduto = 1;
        int idUsuario = 1;

        try (Statement stmt = conn.createStatement()) {
            stmt.execute("INSERT INTO clientes (idCliente, nome) VALUES (1, 'João')");
            stmt.execute("INSERT INTO produtos (idProduto, produto, descricao, preco) VALUES (1, 'Notebook', 'Dell Inspiron', 3500.00)");
        }

        BigDecimal preco = new BigDecimal("3500.00");
        int idVenda = dao.salvarVenda(idUsuario, numeroVenda, idCliente, new java.sql.Timestamp(System.currentTimeMillis()), 3500.00, 1);

        // cria lista de itens
        List<ItemVenda> itens = new ArrayList<>();
        ItemVenda item = new ItemVenda();
        item.setIdProduto(idProduto);
        item.setQuantidade(1);
        item.setPrecoUnitario(preco);
        itens.add(item);

        dao.salvarItensVenda(idVenda, itens);

        try (Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery("SELECT COUNT(*) FROM vendas")) {
            assertTrue(rs.next());
            assertEquals(1, rs.getInt(1));
        }

        try (Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery("SELECT COUNT(*) FROM itemvenda")) {
            assertTrue(rs.next());
            assertEquals(1, rs.getInt(1));
        }
    }

    @Test
    public void testInserirMultiplasVendas() throws Exception {
        int idUsuario = 2;
        int idCliente = 2;
        int idProduto = 2;

        try (Statement stmt = conn.createStatement()) {
            stmt.execute("INSERT INTO clientes (idCliente, nome) VALUES (2, 'Maria')");
            stmt.execute("INSERT INTO produtos (idProduto, produto, descricao, preco) VALUES (2, 'Mouse', 'Mouse sem fio', 150.00)");
        }

        BigDecimal preco = new BigDecimal("150.00");

        // Primeira venda
        int idVenda1 = dao.salvarVenda(idUsuario, 2, idCliente, new java.sql.Timestamp(System.currentTimeMillis()), 150.00, 1);

        // cria lista de itens
        List<ItemVenda> itens1 = new ArrayList<>();
        ItemVenda item1 = new ItemVenda();
        item1.setIdProduto(idProduto);
        item1.setQuantidade(1);
        item1.setPrecoUnitario(preco);
        itens1.add(item1);

        dao.salvarItensVenda(idVenda1, itens1);

        // Segunda venda
        int idVenda2 = dao.salvarVenda(idUsuario, 3, idCliente, new java.sql.Timestamp(System.currentTimeMillis()), 300.00, 2);

        // cria lista de itens
        List<ItemVenda> itens2 = new ArrayList<>();
        ItemVenda item2 = new ItemVenda();
        item2.setIdProduto(idProduto);
        item2.setQuantidade(1);
        item2.setPrecoUnitario(preco);
        itens2.add(item2);

        dao.salvarItensVenda(idVenda2, itens2);

        try (Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery("SELECT COUNT(*) FROM vendas")) {
            assertTrue(rs.next());
            assertEquals(2, rs.getInt(1));
        }

        try (Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery("SELECT COUNT(*) FROM itemvenda")) {
            assertTrue(rs.next());
            assertEquals(2, rs.getInt(1));
        }
    }
}
