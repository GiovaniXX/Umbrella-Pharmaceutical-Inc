
import javax.swing.table.DefaultTableModel;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import up_forms.UP_F03_Produtos;

public class UP_F03_ProdutosTest {

    private UP_F03_Produtos produtos;

    @Before
    public void setUp() {
        produtos = new UP_F03_Produtos();
        // Inicialize qualquer configuração necessária para o teste
    }

    @Test
    public void testMostrarRegistro() {
        // Simule a configuração da tabela com dados de teste
        DefaultTableModel tabela = new DefaultTableModel(new Object[][]{
            {"1", "Produto1", "10.00", "5%", "Anotacao1"},
            {"2", "Produto2", "15.00", "10%", "Anotacao2"}
        }, new String[]{"ID", "Descrição", "Preço", "Imposto", "Anotação"});
        produtos.tblTabela.setModel(tabela);

        // Chame o método mostrarRegistro() para o primeiro registro (produtoAtual = 0)
        produtos.produtoAtual = 0;
        produtos.mostrarRegistro();

        // Verifique se os campos de texto foram preenchidos corretamente
        assertEquals("1", produtos.txtIDProduto.getText());
        assertEquals("Produto1", produtos.txtDescricao.getText());
        assertEquals("10.00", produtos.txtPreco.getText());
        assertEquals(1, produtos.cmbImposto.getSelectedIndex()); // O índice deve ser 1 para "5%"

        // Repita o processo para o segundo registro (produtoAtual = 1)
        produtos.produtoAtual = 1;
        produtos.mostrarRegistro();

        assertEquals("2", produtos.txtIDProduto.getText());
        assertEquals("Produto2", produtos.txtDescricao.getText());
        assertEquals("15.00", produtos.txtPreco.getText());
        assertEquals(2, produtos.cmbImposto.getSelectedIndex()); // O índice deve ser 2 para "10%"
    }
}
