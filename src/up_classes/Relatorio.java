package up_classes;

import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Relatorio {

    public static void relatorioVenda(String arquivo, ResultSet rs) {
        com.itextpdf.text.Document document = new com.itextpdf.text.Document();
        try {
            PdfWriter.getInstance(document, new FileOutputStream(arquivo));
            document.open();

            // Cabeçalho da empresa
            String textoCabecalho = """
                           Umbrella Pharmaceutical Inc
                           Rua: Marechal Rondon 387
                           Bairro: Conta Dinheiro
                           RELATÓRIO DA VENDA
                           """;
            Paragraph cabecalho = new Paragraph(textoCabecalho);
            cabecalho.setAlignment(Element.ALIGN_CENTER);
            document.add(cabecalho);

            document.add(new Paragraph(" "));  // Linha em branco

            // Adicionar informações do vendedor e data da venda
            PdfPTable tabelaVendedor = new PdfPTable(2);
            tabelaVendedor.setWidthPercentage(100); // Preenche a largura da página

            tabelaVendedor.addCell("VENDEDOR");
            tabelaVendedor.addCell("DATA");

            // Preencher os dados do vendedor e data (exemplo, você pode ajustar conforme seu ResultSet)
            tabelaVendedor.addCell("Nome do Vendedor:");
            tabelaVendedor.addCell("Data da Venda:");

            document.add(tabelaVendedor);

            document.add(new Paragraph(" "));  // Linha em branco

            // Cabeçalhos da tabela de produtos
            PdfPTable tabelaProdutos = new PdfPTable(new float[]{1, 2, 2, 2, 2, 1, 2});
            tabelaProdutos.setWidthPercentage(100);  // Preenche a largura da página

            tabelaProdutos.addCell("ID");
            tabelaProdutos.addCell("CLIENTE");
            tabelaProdutos.addCell("PRODUTO");
            tabelaProdutos.addCell("DESCRIÇÃO");
            tabelaProdutos.addCell("PREÇO");
            tabelaProdutos.addCell("QTD.");
            tabelaProdutos.addCell("VALOR");

            // Preencher os dados da venda
            double totalVenda = 0;

            while (rs.next()) {
                tabelaProdutos.addCell(rs.getString("idvenda")); // ID PRODUTO
                tabelaProdutos.addCell(rs.getString("nome")); //NOME DO CLIENTE
                tabelaProdutos.addCell(rs.getString("produto")); // NOME DO PRODUTO
                tabelaProdutos.addCell(rs.getString("descricao")); // DESCRIÇÃO DO ITEM
                tabelaProdutos.addCell(String.format("$%.2f", rs.getDouble("preco"))); // PREÇO
                tabelaProdutos.addCell(rs.getString("quantidade")); // QTD
                double valor = rs.getDouble("preco") * rs.getInt("quantidade");
                tabelaProdutos.addCell(String.format("$%.2f", valor)); // VALOR
                totalVenda += valor;
            }

            document.add(tabelaProdutos);

            // Linhas em branco para separar
            document.add(new Paragraph(" "));
            document.add(new Paragraph(" "));

            // Tabela para os totais
            PdfPTable tabelaTotais = new PdfPTable(2);
            tabelaTotais.setWidthPercentage(50); // Ajuste a largura conforme necessário
            tabelaTotais.setHorizontalAlignment(Element.ALIGN_RIGHT);

            tabelaTotais.addCell("VALOR DA VENDA");
            tabelaTotais.addCell(String.format("$%.2f", totalVenda));

            document.add(tabelaTotais);

            document.close();

        } catch (DocumentException | FileNotFoundException | SQLException e) {
            Logger.getLogger(Dados.class.getName()).log(Level.SEVERE, null, e);
        } finally {
            document.close();
        }
    }
}
