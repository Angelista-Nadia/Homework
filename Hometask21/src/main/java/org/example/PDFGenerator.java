package org.example;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.font.PDFont;
import org.apache.pdfbox.pdmodel.font.PDType1Font;

import java.io.IOException;

public class PDFGenerator {

    public void generatePDF(String filePath, String content) throws IOException {
        try (PDDocument document = new PDDocument()) {
            PDPage page = new PDPage();
            document.addPage(page);

            PDFont font = PDType1Font.COURIER;
            try (PDPageContentStream contentStream = new PDPageContentStream(document, page)) {
                contentStream.beginText();
                contentStream.setFont(font, 12);
                contentStream.newLineAtOffset(100, 700);
                contentStream.showText(content);
                contentStream.endText();
            }

            document.save(filePath);
        }
    }

    public static void main(String[] args) {
        PDFGenerator pdfGenerator = new PDFGenerator();
        try {
            pdfGenerator.generatePDF("sample.pdf", "Hello, PDFBox!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}