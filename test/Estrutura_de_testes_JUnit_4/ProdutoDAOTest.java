package Estrutura_de_testes_JUnit_4;

import dao.ProdutoDAO;
import java.math.BigDecimal;
import model.Produto;
import org.junit.*;
import java.sql.*;

import static org.junit.Assert.*;

public class ProdutoDAOTest {

    @Before
    public void prepararBanco() throws SQLException {
        try (Connection conn = DriverManager.getConnection("jdbc:h2:mem:testdb;DB_CLOSE_DELAY=-1", "sa", ""); 
                Statement stmt = conn.createStatement()) {
            stmt.execute("CREATE TABLE produtos ("
                    + "idProduto INT AUTO_INCREMENT PRIMARY KEY, "
                    + "produto VARCHAR(100), "
                    + "preco DECIMAL, "
                    + "descricao VARCHAR(255))");
        }
    }

    @After
    public void limparBanco() throws SQLException {
        try (Connection conn = DriverManager.getConnection("jdbc:h2:mem:testdb;DB_CLOSE_DELAY=-1", "sa", ""); 
                Statement stmt = conn.createStatement()) {
            stmt.execute("DROP TABLE produtos");
        }
    }

    @Test
    public void testInsercaoProduto() {
        Produto produto = new Produto();
        produto.setProduto("Dipirona 500mg");
        produto.setDescricao("Analgésico e antitérmico");
        produto.setPreco(new BigDecimal("8.90"));

        ProdutoDAO dao = new ProdutoDAO();
        String resultado = dao.inserirProduto(produto);

        assertEquals("Produto inserido com sucesso!", resultado);

        Produto produtoInserido = dao.getProdutoPorNome("Dipirona 500mg");
        assertNotNull(produtoInserido);
        assertEquals("Dipirona 500mg", produtoInserido.getProduto());
        assertEquals("Analgésico e antitérmico", produtoInserido.getDescricao());
        assertEquals(new BigDecimal("8.90"), produto.getPreco());
    }

    @Test
    public void testEdicaoProduto() {
        ProdutoDAO dao = new ProdutoDAO();
        Produto produto = new Produto(0, "Dipirona 500mg", new BigDecimal("8.90"), "Analgésico e antitérmico");
        dao.inserirProduto(produto);

        Produto produtoEditavel = dao.getProdutoPorNome("Dipirona 500mg");
        produtoEditavel.setDescricao("Medicamento para dor e febre");
        produtoEditavel.setPreco(new BigDecimal("8.90"));

        String resultado = dao.editarProduto(produtoEditavel);
        assertEquals("Produto editado com sucesso!", resultado);

        Produto produtoEditado = dao.getProdutoPorNome("Dipirona 500mg");
        assertEquals("Medicamento para dor e febre", produtoEditado.getDescricao());
        assertEquals(new BigDecimal("8.90"), produto.getPreco());
    }

    @Test
    public void testExclusaoProduto() {
        ProdutoDAO dao = new ProdutoDAO();
        Produto produto = new Produto(0, "Dipirona 500mg", new BigDecimal("8.90"), "Analgésico e antitérmico");
        dao.inserirProduto(produto);

        Produto produtoParaExcluir = dao.getProdutoPorNome("Dipirona 500mg");
        String resultado = dao.deletarProduto(produtoParaExcluir.getIdProduto());

        assertEquals("Produto excluído com sucesso!", resultado);

        Produto produtoExcluido = dao.getProdutoPorNome("Dipirona 500mg");
        assertNull(produtoExcluido);
    }
}
