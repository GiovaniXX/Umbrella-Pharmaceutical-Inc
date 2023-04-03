package up_classes;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.io.IOException;
import java.io.InputStream;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.rendering.PDFRenderer;

//public class PDFPrintPage implements Printable {
//
//    private final PDDocument pdDocument;
//    private final PDFRenderer pdfRenderer;
//
//    public PDFPrintPage(PDFFile pdfFile) throws IOException {
//        InputStream input = pdfFile.getInputStream();
//        this.pdDocument = PDDocument.load(pdfFile.getFile());
//        this.pdfRenderer = new PDFRenderer(pdDocument);
//    }
//
//    @Override
//    public int print(Graphics graphics, PageFormat pageFormat, int pageIndex) throws PrinterException {
//        if (pageIndex >= pdDocument.getNumberOfPages()) {
//            return Printable.NO_SUCH_PAGE;
//        }
//
//        graphics.translate((int) pageFormat.getImageableX(), (int) pageFormat.getImageableY());
//        try {
//            pdfRenderer.renderPageToGraphics(pageIndex, (Graphics2D) graphics);
//        } catch (IOException e) {
//            throw new PrinterException("Error rendering PDF page");
//        }
//        return Printable.PAGE_EXISTS;
//    }
//}
