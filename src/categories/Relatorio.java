package categories;

import com.itextpdf.text.*;
import com.itextpdf.text.pdf.*;
import com.mysql.cj.util.Util;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Relatorio {

    public static void relatorioVenda(String arquivo, ResultSet rs) {
        Document document = new Document();
        try {
            PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream(arquivo));
            document.open(); // ✅ Abre o documento antes de qualquer operação

            // Imagem de fundo — tratada separadamente
            try {
                Image background = Image.getInstance("H:\\Projetos Java 2025\\Umbrella-Pharmaceutical-Inc\\src\\main\\resources\\img\\logos\\background.jpg");
                background.setAbsolutePosition(0, 0);
                background.scaleToFit(PageSize.A4.getWidth(), PageSize.A4.getHeight());
                writer.getDirectContentUnder().addImage(background);
            } catch (DocumentException | IOException imgEx) {
                Logger.getLogger(Util.class.getName()).log(Level.WARNING, "Imagem de fundo não carregada", imgEx);
            }

            // Logotipo (opcional)           
            Image logo = Image.getInstance("H:\\Projetos Java 2025\\Umbrella-Pharmaceutical-Inc\\src\\main\\resources\\img\\banners\\logo.jpg");
            logo.scaleToFit(80, 80);
            logo.setAlignment(Image.ALIGN_CENTER);
            document.add(logo);

            // Título com fonte branco
            Font fonteTitulo = new Font(Font.FontFamily.HELVETICA, 18, Font.BOLD, new BaseColor(255, 255, 255));
            Paragraph titulo = new Paragraph("Umbrella Pharmaceutical Inc\nRelatório de Vendas", fonteTitulo);
            titulo.setAlignment(Element.ALIGN_CENTER);
            titulo.setSpacingAfter(20);
            document.add(titulo);

            // TABELA DE VENDEDOR E DATA
            PdfPTable tabelaVendedor = new PdfPTable(2);
            tabelaVendedor.setWidthPercentage(100);
            tabelaVendedor.setSpacingAfter(10);

            Font fonteLabel = new Font(Font.FontFamily.HELVETICA, 12, Font.BOLD, BaseColor.WHITE);
            Font fonteValor = new Font(Font.FontFamily.HELVETICA, 12, Font.NORMAL, BaseColor.WHITE);

            PdfPCell cell1 = new PdfPCell(new Phrase("VENDEDOR", fonteLabel));
            PdfPCell cell2 = new PdfPCell(new Phrase("DATA", fonteLabel));
            PdfPCell cell3 = new PdfPCell(new Phrase("Nome do Vendedor:", fonteValor));
            PdfPCell cell4 = new PdfPCell(new Phrase("Data da Venda:", fonteValor));

            PdfPCell[] cellsVendedor = {cell1, cell2, cell3, cell4};
            for (PdfPCell cell : cellsVendedor) {
                cell.setBorderColor(BaseColor.WHITE);               
                cell.setHorizontalAlignment(Element.ALIGN_LEFT);
                cell.setPadding(5);
                tabelaVendedor.addCell(cell);
            }

            document.add(tabelaVendedor);

            // TABELA DE PRODUTOS
            PdfPTable tabelaProdutos = new PdfPTable(new float[]{1, 2, 2, 2, 2, 1, 2});
            tabelaProdutos.setWidthPercentage(100);

            Font fonteCabecalho = new Font(Font.FontFamily.HELVETICA, 12, Font.BOLD, BaseColor.WHITE);
            BaseColor corCabecalho = new BaseColor(0, 102, 204);

            String[] colunas = {"ID", "CLIENTE", "PRODUTO", "DESCRIÇÃO", "PREÇO", "QTD.", "VALOR"};
            for (String coluna : colunas) {
                PdfPCell cell = new PdfPCell(new Phrase(coluna, fonteCabecalho));
                cell.setBackgroundColor(corCabecalho);
                cell.setHorizontalAlignment(Element.ALIGN_CENTER);
                cell.setPadding(6);
                tabelaProdutos.addCell(cell);
            }

            // Linhas alternadas
            double totalVenda = 0;
            boolean alternar = false;

            while (rs.next()) {
                alternar = !alternar;

                PdfPCell[] cells = new PdfPCell[]{
                    new PdfPCell(new Phrase(rs.getString("idvenda"), fonteValor)),
                    new PdfPCell(new Phrase(rs.getString("nomeCliente"), fonteValor)),
                    new PdfPCell(new Phrase(rs.getString("nomeProduto"), fonteValor)),
                    new PdfPCell(new Phrase(rs.getString("descricao"), fonteValor)),
                    new PdfPCell(new Phrase(String.format("R$ %.2f", rs.getDouble("preco")), fonteValor)),
                    new PdfPCell(new Phrase(rs.getString("quantidade"), fonteValor)),
                    new PdfPCell(new Phrase(String.format("R$ %.2f", rs.getDouble("preco") * rs.getInt("quantidade")), fonteValor))
                };

                for (PdfPCell cell : cells) {
                    cell.setBorderColor(BaseColor.WHITE);
                    cell.setHorizontalAlignment(Element.ALIGN_CENTER);
                    cell.setPadding(5);
                    tabelaProdutos.addCell(cell);
                }

                totalVenda += rs.getDouble("preco") * rs.getInt("quantidade");
            }

            document.add(tabelaProdutos);

            // Espaço antes do total
            document.add(new Paragraph(" "));
            document.add(new Paragraph(" "));

            // Tabela de totais com destaque
            Font fonteTotais = new Font(Font.FontFamily.HELVETICA, 12, Font.BOLD, new BaseColor(255, 255, 255));
            PdfPTable tabelaTotais = new PdfPTable(2);
            tabelaTotais.setWidthPercentage(40);
            tabelaTotais.setHorizontalAlignment(Element.ALIGN_RIGHT);

            PdfPCell label = new PdfPCell(new Phrase("VALOR TOTAL", fonteTotais));
            PdfPCell valor = new PdfPCell(new Phrase(String.format("R$ %.2f", totalVenda), fonteTotais));

            label.setBorder(Rectangle.NO_BORDER);
            valor.setBorder(Rectangle.NO_BORDER);
            label.setHorizontalAlignment(Element.ALIGN_LEFT);
            valor.setHorizontalAlignment(Element.ALIGN_RIGHT);

            tabelaTotais.addCell(label);
            tabelaTotais.addCell(valor);
            document.add(tabelaTotais);

        } catch (DocumentException | IOException | SQLException e) {
            Logger.getLogger(Util.class.getName()).log(Level.SEVERE, null, e);
        } finally {
            document.close();
        }
    }
}
