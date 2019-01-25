package backend.Actividades;

import com.itextpdf.text.*;
import com.itextpdf.text.pdf.*;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Date;
import com.itextpdf.text.pdf.PdfWriter;

public class CrearPDF {
    
    private static final Font chapterFont = FontFactory.getFont(FontFactory.HELVETICA, 26, Font.BOLDITALIC);
    private static final Font paragraphFont = FontFactory.getFont(FontFactory.HELVETICA, 12, Font.NORMAL);
         
    private static final Font categoryFont = new Font(Font.FontFamily.TIMES_ROMAN, 18, Font.BOLD);
    private static final Font subcategoryFont = new Font(Font.FontFamily.TIMES_ROMAN, 16, Font.BOLD);
    private static final Font blueFont = new Font(Font.FontFamily.TIMES_ROMAN, 12, Font.NORMAL, BaseColor.BLUE);    
    private static final Font smallBold = new Font(Font.FontFamily.TIMES_ROMAN, 12, Font.BOLD);
    
    private static final String FILE = "c:/temp/informe.pdf";
    private static final Font catFont = new Font(Font.FontFamily.TIMES_ROMAN, 18,Font.BOLD);
    private static final Font redFont = new Font(Font.FontFamily.TIMES_ROMAN, 12,Font.NORMAL, BaseColor.BLUE);
    private static final Font subFont = new Font(Font.FontFamily.TIMES_ROMAN, 16,Font.BOLD);

    public static void main(String[] args) {
        try {
            Document document = new Document();
            PdfWriter.getInstance(document, new FileOutputStream(FILE));
            document.open();
            addMetaData(document);
            addTitlePage(document);
            addContent(document);
            document.close();
        } catch (DocumentException | FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    // iText allows to add metadata to the PDF which can be viewed in your Adobe
    // Reader
    // under File -> Properties
    private static void addMetaData(Document document) {
        document.addTitle("INFORME INMOBILIARIA NOVILIE");
        document.addSubject("ReporteDiario");
        document.addKeywords("Reporte, Diario, pdf");
        document.addAuthor("Novilie");
        document.addCreator("Novilie");
    }

    private static void addTitlePage(Document document) throws DocumentException {
        Paragraph preface = new Paragraph();
        // We add one empty line
        addEmptyLine(preface, 1);
        // Lets write a big header
        preface.add(new Paragraph("Informe de Control", catFont));

        addEmptyLine(preface, 1);

        // Will create: Report generated by: _name, _date
        preface.add(new Paragraph("Reporte generado por: NOVILIE , " + new Date(), smallBold));

        addEmptyLine(preface, 3);

        //CONTENIDO PRIMERA PAGINA
        preface.add(new Paragraph("Aqui se ponen las cosas que se quieren Ver ",smallBold));

        addEmptyLine(preface, 8);

        preface.add(new Paragraph("Uy mano cuidado.",redFont));

        document.add(preface);
        // Start a new page
        document.newPage();
    }

    private static void addContent(Document document) throws DocumentException {
        Paragraph preface = new Paragraph();
        Anchor anchor = new Anchor("CONTENIDO PRINCIPAL", catFont);
        anchor.setName("CONTENIDO PRINCIPA");

        // Second parameter is the number of the chapter
        Chapter catPart = new Chapter(new Paragraph(anchor), 1);

        Paragraph subPara = new Paragraph("CAPTACIONES", subFont);
        Section subCatPart = catPart.addSection(subPara);
        //
        subCatPart.add(new Paragraph(" Aqui se supone van las captaciones"));
        
        addEmptyLine(preface, 1);
        
        subPara = new Paragraph("CITAS Y VISITAS", subFont);
        subCatPart = catPart.addSection(subPara);
        subCatPart.add(new Paragraph("Cita#1"));
        subCatPart.add(new Paragraph("Cita#2"));
        subCatPart.add(new Paragraph("Cita#3"));
        addEmptyLine(preface, 1);

        // add a list
        createList(subCatPart);
        
        addEmptyLine(preface, 5);
        
        subCatPart.add(preface);

        // add a table
        createTable(subCatPart);

        // now add all this to the document
        document.add(catPart);

        // Next section
        anchor = new Anchor("CONTENIDO SECUNDARIO", catFont);
        anchor.setName("CONTENIDO SECUNDARI");

        // Second parameter is the number of the chapter
        catPart = new Chapter(new Paragraph(anchor), 1);

        subPara = new Paragraph("LLAMADAS RECIBIDAS", subFont);
        subCatPart = catPart.addSection(subPara);
        subCatPart.add(new Paragraph("Llama#1"));

        // now add all this to the document
        document.add(catPart);

    }

    private static void createTable(Section subCatPart){
        PdfPTable table = new PdfPTable(3);

        // t.setBorderColor(BaseColor.GRAY);
        // t.setPadding(4);
        // t.setSpacing(4);
        // t.setBorderWidth(1);

        PdfPCell c1 = new PdfPCell(new Phrase("ASESOR"));
        c1.setHorizontalAlignment(Element.ALIGN_CENTER);
        table.addCell(c1);

        c1 = new PdfPCell(new Phrase("CLIENTE"));
        c1.setHorizontalAlignment(Element.ALIGN_CENTER);
        table.addCell(c1);

        c1 = new PdfPCell(new Phrase("RESULTADO"));
        c1.setHorizontalAlignment(Element.ALIGN_CENTER);
        table.addCell(c1);
        table.setHeaderRows(1);

        table.addCell("PABLITO");
        table.addCell("LA PANADERA");
        table.addCell("Lo que sea que haya pasado");
        table.addCell("JOSEFA");
        table.addCell("EL DEL GYM");
        table.addCell("lo que paso paso");

        subCatPart.add(table);

    }

    private static void createList(Section subCatPart) {
        List list = new List(true, false, 10);
        list.add(new ListItem("Elemento numero 1"));
        list.add(new ListItem("Elemento numero 2"));
        list.add(new ListItem("Elemento numero 3"));
        subCatPart.add(list);
    }

    private static void addEmptyLine(Paragraph paragraph, int number) {
        for (int i = 0; i < number; i++) {
            paragraph.add(new Paragraph(" "));
        }
    }
}