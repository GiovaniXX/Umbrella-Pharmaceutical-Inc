package up_classes;

import java.awt.print.Pageable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import javax.print.PrintService;
import javax.print.PrintServiceLookup;
import javax.print.attribute.HashPrintRequestAttributeSet;
import javax.print.attribute.PrintRequestAttributeSet;
import javax.print.attribute.standard.Copies;
import javax.print.attribute.standard.MediaSizeName;
import javax.print.attribute.standard.Sides;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class HPDeskjetInkAdvantage2546Printer {

    public static void main(String[] args) throws PrinterException {
        String filename = "path/to/file.pdf";
        printPDF(filename);
    }

    private static void printPDF(String filename) throws PrinterException {
        try {
            try (FileInputStream fileInputStream = new FileInputStream(filename)) {
                PrintRequestAttributeSet printRequestAttributeSet = new HashPrintRequestAttributeSet();
                printRequestAttributeSet.add(MediaSizeName.NA_LETTER);
                printRequestAttributeSet.add(Sides.ONE_SIDED);
                printRequestAttributeSet.add(new Copies(1));

                PrintService[] printServices = PrintServiceLookup.lookupPrintServices(null, null);

                PrintService hpPrinter = null;
                for (PrintService printService : printServices) {
                    if (printService.getName().equals("HP Deskjet 2540 series")) {
                        hpPrinter = printService;
                        break;
                    }
                }

                if (hpPrinter == null) {
                    System.err.println("Could not find HP Deskjet 2540 series printer");
                    return;
                }

                //PDFFile pdfFile = new PDFFile(fileInputStream);
                //PDFPrintPage pages = new PDFPrintPage(pdfFile);

                PrinterJob job = PrinterJob.getPrinterJob();
                job.setPrintService(hpPrinter);
                //job.setPageable((Pageable) pages);
                job.print(printRequestAttributeSet);
            }
        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + filename);
        } catch (IOException | PrinterException e) {
        }
    }
}
