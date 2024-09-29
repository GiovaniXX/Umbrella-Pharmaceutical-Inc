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

            // Cabeçalho do relatório
            String textoCabecalho = """
                           Umbrella Pharmaceutical Inc
                           Rua: Marechal Rondon 387
                           Bairro: Conta Dinheiro
                           Relatórios de vendas
                           """;
            Paragraph cabecalho = new Paragraph(textoCabecalho);
            cabecalho.setAlignment(Element.ALIGN_CENTER);
            document.add(cabecalho);

            document.add(new Paragraph(" "));  // Adiciona uma linha em branco

            boolean registro = rs.next();
            int totQuantGer = 0;
            int totValGer = 0;

            while (registro) {
                // Informações da venda
                String vendaInfo = String.format("Venda #: %s\nID Cliente: %s\nNome Cliente: %s\nData: %s",
                        rs.getString("idvenda"),
                        rs.getString("idcliente"),
                        rs.getString("nomeFull"),
                        rs.getString("data"));
                document.add(new Paragraph(vendaInfo));
                document.add(new Paragraph(" "));  // Linha em branco

                // Tabela com os produtos
                PdfPTable tabela = new PdfPTable(5);  // Definir número de colunas
                tabela.setWidthPercentage(100); // Preenche a largura da página

                // Adiciona os cabeçalhos da tabela
                tabela.addCell("Id Produto");
                tabela.addCell("Descricao");
                tabela.addCell("Preco");
                tabela.addCell("Quantidade");
                tabela.addCell("Valor");

                int totQuantFat = 0;
                int totValFat = 0;
                int vendaAtual = rs.getInt("idvenda");

                // Loop para adicionar os produtos
                do {
                    tabela.addCell(rs.getString("produto")); // Adiciona Id Produto
                    tabela.addCell(rs.getString("descricao")); // Adiciona Descricao
                    tabela.addCell(rs.getString("preco")); // Adiciona Preco
                    tabela.addCell(rs.getString("quantidade")); // Adiciona Quantidade
                    tabela.addCell(rs.getString("valor")); // Adiciona Valor

                    totQuantFat += rs.getInt("quantidade");
                    totValFat += rs.getInt("valor");

                } while (registro && vendaAtual == rs.getInt("idvenda") && (registro = rs.next()));

                // Adiciona a tabela ao documento
                document.add(tabela);

                // Adiciona o total das vendas para essa venda
                PdfPTable tabelaTotal = new PdfPTable(5);
                tabelaTotal.addCell(" ");
                tabelaTotal.addCell(" ");
                tabelaTotal.addCell("Total Vendas");
                tabelaTotal.addCell(String.valueOf(totQuantFat));
                tabelaTotal.addCell(String.valueOf(totValFat));
                document.add(tabelaTotal);

                // Atualiza o total geral
                totQuantGer += totQuantFat;
                totValGer += totValFat;

                document.add(new Paragraph(" "));  // Linha em branco entre vendas
            }

            // Adiciona o total geral
            PdfPTable tabelaTotalGeral = new PdfPTable(5);
            tabelaTotalGeral.addCell(" ");
            tabelaTotalGeral.addCell(" ");
            tabelaTotalGeral.addCell("Total Geral");
            tabelaTotalGeral.addCell(String.valueOf(totQuantGer));
            tabelaTotalGeral.addCell(String.valueOf(totValGer));
            document.add(tabelaTotalGeral);

            document.close();

        } catch (DocumentException | FileNotFoundException | SQLException e) {
            Logger.getLogger(Dados.class.getName()).log(Level.SEVERE, null, e);
        } finally {
            document.close();
        }
    }
}
