package up_classes;

import com.itextpdf.text.DocumentException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.io.FileOutputStream;
import java.sql.ResultSet;
import up_forms.UP_F11_Relatorios_Vendas;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.pdf.PdfPTable;
import java.io.FileNotFoundException;
import java.sql.SQLException;

public class Relatorio {

    public static void relatorioVenda(String arquivo, ResultSet rs) {
        com.itextpdf.text.Document documento = new com.itextpdf.text.Document();
        try {
            PdfWriter.getInstance((com.itextpdf.text.Document) documento, new FileOutputStream(arquivo));
            String texto = """
                           Umbrella Pharmaceutical Inc 
                           Relatórios de vendas!
                           Rua: Marechal Rondon 387 
                           Bairro: Conta Dinheiro
                           """;
            Paragraph paragrafo = new Paragraph(texto);
            documento.open();
            documento.add(paragrafo);

            paragrafo = new Paragraph(" ");
            documento.add(paragrafo);
            boolean registro = rs.next();
            PdfPTable tabela;

            int totalQtdeVenda = 0;
            int totalValVenda = 0;
            int totalQtdeGerada = 0;
            int totalValGerada = 0;

            while (registro) {
                tabela = new PdfPTable(2);

                tabela.addCell("Venda #:");
                tabela.addCell(rs.getString("idVenda"));
                tabela.addCell("ID Cliente #:");
                tabela.addCell(rs.getString("idCliente"));
                tabela.addCell("Nome Cliente #:");
                tabela.addCell(rs.getString("nomeFull"));
                tabela.addCell("Data #:");
                tabela.addCell(rs.getString("data"));

                paragrafo = new Paragraph();
                paragrafo.add(tabela);
                documento.add(paragrafo);

                paragrafo = new Paragraph(" ");
                documento.add(paragrafo);

                totalQtdeVenda = 0;
                totalValVenda = 0;

                tabela = new PdfPTable(6);
                tabela.addCell("Linha");
                tabela.addCell("ID Produto");
                tabela.addCell("Descricao");
                tabela.addCell("Preco");
                tabela.addCell("Quantidade");
                tabela.addCell("Valor");

                paragrafo = new Paragraph();
                paragrafo.add(tabela);
                documento.add(paragrafo);

                int vendaAtual = rs.getInt("idvenda");

                while (registro && vendaAtual == rs.getInt("idVenda")) {
                    tabela = new PdfPTable(6);
                    tabela.addCell(rs.getString("idLinha"));
                    tabela.addCell(rs.getString("idProduto"));
                    tabela.addCell(rs.getString("descricao"));
                    tabela.addCell(rs.getString("preco"));
                    tabela.addCell(rs.getString("quantidade"));
                    tabela.addCell(rs.getString("valor"));

                    paragrafo = new Paragraph();
                    paragrafo.add(tabela);
                    documento.add(paragrafo);

                    totalQtdeVenda += rs.getInt("quantidade");
                    totalValVenda += rs.getInt("valor");
                    registro = rs.next();
                }

                tabela = new PdfPTable(6);
                tabela.addCell(" ");
                tabela.addCell(" ");
                tabela.addCell(" ");
                tabela.addCell("Total Vendas");
                tabela.addCell("" + totalQtdeVenda);
                tabela.addCell("" + totalValVenda);

                paragrafo = new Paragraph();
                paragrafo.add(tabela);
                documento.add(paragrafo);

                totalQtdeGerada += totalQtdeVenda;
                totalValGerada += totalValVenda;

                paragrafo = new Paragraph(" ");
                paragrafo.add(paragrafo);
            }
            tabela = new PdfPTable(6);
            tabela.addCell(" ");
            tabela.addCell(" ");
            tabela.addCell(" ");
            tabela.addCell("Total Geral");
            tabela.addCell("" + totalQtdeGerada);
            tabela.addCell("" + totalValGerada);

            paragrafo = new Paragraph();
            paragrafo.add(tabela);
            documento.add(paragrafo);
            documento.close();
        } catch (DocumentException | FileNotFoundException | SQLException ex) {
            Logger.getLogger(UP_F11_Relatorios_Vendas.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            documento.close();
        }
    }
}
