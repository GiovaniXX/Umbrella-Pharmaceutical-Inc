package up_classes;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

//public class PDFFile {
//
//    private final File file;
//    private final PDDocument pdDocument;
//    private final PDFTextStripper pdfTextStripper;
//
//    public PDFFile(FileInputStream file) throws IOException {
//        this.file = new File(file);
//        this.pdDocument = PDDocument.load(file);
//        this.pdfTextStripper = new PDFTextStripper();
//    }
//
//    public String getText() throws IOException {
//        return pdfTextStripper.getText(pdDocument);
//    }
//
//    public void close() throws IOException {
//        pdDocument.close();
//    }
//    
//    public PDFFile(File file) {
//        this.file = file;
//    }
//
//    public File getFile() {
//        return this.file;
//    }
//    
//    public InputStream getInputStream()throws IOException {
//        return new FileInputStream(file);
//    }
//}
