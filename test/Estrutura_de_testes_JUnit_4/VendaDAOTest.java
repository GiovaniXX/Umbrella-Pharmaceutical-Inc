package Estrutura_de_testes_JUnit_4;

import dao.VendaDAO;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;
import java.sql.*;
import java.util.Date;

import static org.junit.Assert.*;

public class VendaDAOTest {

    private Connection conn;
    private VendaDAO dao;

    @Before
    public void setUp() throws Exception {
        conn = DriverManager.getConnection("jdbc:h2:mem:testdb;DB_CLOSE_DELAY=-1", "sa", "");
        dao = new VendaDAO(conn);

        try (Statement stmt = conn.createStatement()) {
            stmt.execute("CREATE TABLE clientes (idcliente INT PRIMARY KEY, nome VARCHAR(100))");
            stmt.execute("CREATE TABLE produtos (idproduto INT PRIMARY KEY, produto VARCHAR(100), descricao VARCHAR(255), preco DECIMAL(10,2))");
            stmt.execute("CREATE TABLE vendas (idVenda INT AUTO_INCREMENT PRIMARY KEY, produto VARCHAR(255), descricao VARCHAR(255), preco DECIMAL(10,2), quantidade INT, dataVenda DATETIME, idProduto INT, idCliente INT, idUsuario INT, numerovenda INT, valortotal DOUBLE)");
            stmt.execute("CREATE TABLE detalhe_venda (idDetalheVenda INT AUTO_INCREMENT PRIMARY KEY, idVenda INT, idProduto INT, preco DECIMAL(10,2), quantidade INT)");
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
            stmt.execute("INSERT INTO clientes (idcliente, nome) VALUES (1, 'João')");
            stmt.execute("INSERT INTO produtos (idproduto, produto, descricao, preco) VALUES (1, 'Notebook', 'Dell Inspiron', 3500.00)");
        }

        BigDecimal preco = new BigDecimal("3500.00");
        int idVenda = dao.salvarVenda(idUsuario, numeroVenda, idCliente, new Date(), 3500.00, 1, "Notebook", "Dell Inspiron", preco, idProduto);
        dao.salvarDetalheVenda(idVenda, idProduto, preco, 1);

        try (Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery("SELECT COUNT(*) FROM vendas")) {
            assertTrue(rs.next());
            assertEquals(1, rs.getInt(1));
        }

        try (Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery("SELECT COUNT(*) FROM detalhe_venda")) {
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
            stmt.execute("INSERT INTO clientes (idcliente, nome) VALUES (2, 'Maria')");
            stmt.execute("INSERT INTO produtos (idproduto, produto, descricao, preco) VALUES (2, 'Mouse', 'Mouse sem fio', 150.00)");
        }

        BigDecimal preco = new BigDecimal("150.00");

        int idVenda1 = dao.salvarVenda(idUsuario, 2, idCliente, new Date(), 150.00, 1, "Mouse", "Mouse sem fio", preco, idProduto);
        dao.salvarDetalheVenda(idVenda1, idProduto, preco, 1);

        int idVenda2 = dao.salvarVenda(idUsuario, 3, idCliente, new Date(), 300.00, 2, "Mouse", "Mouse com fio", preco, idProduto);
        dao.salvarDetalheVenda(idVenda2, idProduto, preco, 2);

        try (Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery("SELECT COUNT(*) FROM vendas")) {
            assertTrue(rs.next());
            assertEquals(2, rs.getInt(1));
        }

        try (Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery("SELECT COUNT(*) FROM detalhe_venda")) {
            assertTrue(rs.next());
            assertEquals(2, rs.getInt(1));
        }
    }
}
