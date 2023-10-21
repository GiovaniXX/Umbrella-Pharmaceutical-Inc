package up_classes;

import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.HeadlessException;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Relatorio {

    public static void relatorioFatura(String arquivo, ResultSet rs) {
        com.itextpdf.text.Document document = new com.itextpdf.text.Document();
        try {
            PdfWriter.getInstance((com.itextpdf.text.Document) document, new FileOutputStream(arquivo));
            String texto = """
                           Umbrella Pharmaceutical Inc                           
                           Rua: Marechal Rondon 387 
                           Bairro: Conta Dinheiro
                           Relatórios de vendas!
                           """;
            document.open();
            Paragraph paragraph = new Paragraph();
            document.add(paragraph);

            // Centraliza o título na tabela
            PdfPTable tabelaTitulo = new PdfPTable(1);
            PdfPCell cellTitulo = new PdfPCell(new Phrase(texto));
            cellTitulo.setHorizontalAlignment(Element.ALIGN_CENTER);
            tabelaTitulo.addCell(cellTitulo);
            document.add(tabelaTitulo);

            paragraph = new Paragraph(" ");
            document.add(paragraph);
            boolean registro = rs.next();
            PdfPTable tabela;

            int totQuantFat = 0;
            int totValFat = 0;
            int totQuantGer = 0;
            int totValGer = 0;

            while (registro) {
                tabela = new PdfPTable(2);
                tabela.addCell("Venda #:");
                tabela.addCell(rs.getString("idvenda"));
                tabela.addCell("ID Cliente");
                tabela.addCell(rs.getString("idcliente"));
                tabela.addCell("Nome Cliente");
                tabela.addCell(rs.getString("nomeFull"));
                tabela.addCell("Data");
                tabela.addCell(rs.getString("data"));

                paragraph = new Paragraph();
                paragraph.add(tabela);
                document.add(paragraph);

                paragraph = new Paragraph(" ");
                document.add(paragraph);

                totQuantFat = 0;
                totValFat = 0;

                tabela = new PdfPTable(6);
                tabela.addCell("Linha");
                tabela.addCell("ID Produto");
                tabela.addCell("Descricao");
                tabela.addCell("Preco");
                tabela.addCell("Quantidade");
                tabela.addCell("Valor");

                paragraph = new Paragraph();
                paragraph.add(tabela);
                document.add(paragraph);

                int faturaAtual = rs.getInt("idFatura");
                while (registro && faturaAtual == rs.getInt("idFatura")) {
                    tabela = new PdfPTable(6);
                    tabela.addCell(rs.getString("linha"));
                    tabela.addCell(rs.getString("idProduto"));
                    tabela.addCell(rs.getString("descricao"));
                    tabela.addCell(rs.getString("preco"));
                    tabela.addCell(rs.getString("quantidade"));
                    tabela.addCell(rs.getString("valor"));

                    paragraph = new Paragraph();
                    paragraph.add(tabela);
                    document.add(paragraph);

                    totQuantFat += rs.getInt("quantidade");
                    totValFat += rs.getInt("valor");

                    registro = rs.next();
                }

                tabela = new PdfPTable(6);
                tabela.addCell(" ");
                tabela.addCell(" ");
                tabela.addCell(" ");
                tabela.addCell("Total Vendas");
                tabela.addCell(String.valueOf(totQuantFat));
                tabela.addCell(String.valueOf(totValFat));

                paragraph = new Paragraph();
                paragraph.add(tabela);
                document.add(paragraph);

                totQuantGer += totQuantFat;
                totValGer += totValFat;

                paragraph = new Paragraph(" ");
                document.add(paragraph);
            }

            tabela = new PdfPTable(6);
            tabela.addCell(" ");
            tabela.addCell(" ");
            tabela.addCell(" ");
            tabela.addCell("Total Geral");
            tabela.addCell(String.valueOf(totQuantGer));
            tabela.addCell(String.valueOf(totValGer));

            paragraph = new Paragraph();
            paragraph.add(tabela);
            document.add(paragraph);

            document.close();

        } catch (DocumentException | HeadlessException | FileNotFoundException | SQLException e) {
            Logger.getLogger(Dados.class.getName()).log(Level.SEVERE, null, e);
        } finally {
            document.close();
        }
    }
}
/**
 * 01000111 01101001 01101111 01110110 01100001 01101110 01101110 01101001
 */
