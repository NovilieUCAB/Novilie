package backend.Actividades;

import BBDD.Fecha;
import BBDD.ModelosBD.*;
import BBDD.Telefono;
import backend.Exception.TelefonoException;
import com.itextpdf.text.*;
import com.itextpdf.text.pdf.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

import com.itextpdf.text.pdf.PdfWriter;

public class CrearPDF {

    private ArrayList<CaptacionEntity> captaciones;
    private ArrayList<VentaEntity> ventas;
    private ArrayList<ClienteEntity> clientes;
    private ArrayList<VisitaEntity> visitas;
    private String nombreUsuario;

    private static final Font smallBold = new Font(Font.FontFamily.TIMES_ROMAN, 10, Font.BOLD);
    private static final Font small = new Font(Font.FontFamily.TIMES_ROMAN, 10, Font.NORMAL);
    private static final Font catFont = new Font(Font.FontFamily.TIMES_ROMAN, 20,Font.BOLD);
    private static final Font redFont = new Font(Font.FontFamily.TIMES_ROMAN, 12,Font.NORMAL, BaseColor.RED);
    private static final Font subFont = new Font(Font.FontFamily.TIMES_ROMAN, 16,Font.UNDERLINE);

    public static void main(String[] args) {
            new CrearPDF().init(new Fecha(26,01,2019),new UsuarioSistemaEntity("Josefo", "Perez","JosePerez",0,
        "cereal", "josefoPerez@gamil.com"));
    }

    public void init(Fecha fecha, UsuarioSistemaEntity u) {
        try {
            this.nombreUsuario=u.getNombreUsuario();
            //--------------------------SE LEERAN DE LA BD---------------------------------------------------
            HashMap<String,Boolean> hs = new HashMap<>();
            hs.put("Contacto Inicial  con el cliente propietario o Visita de cortesía.",true);
            hs.put("Recaudar información de documentos y recaudación de Fotografía del Inmueble.",true);
            hs.put("Recaudar información de documentos y recaudación de Fotografía del Inmueble.",true);
            hs.put("Generar Estudio comparativo de Mercado y hacerlo firmar por el cliente.",true);
            hs.put("Entrega de Compromiso de Servicios y forma de mandato de venta o Forma de Exclusividad.",true);
            hs.put("Realizar la colocación de las Foto en las Paginas d comercialización de los productos de la Oficina.",true);

            HashMap<String,Integer> hi = new HashMap<>();
            hi.put("27.426.556",40);
            hi.put("19.765.171",60);
            hi.put("24.567.456",20);

            ArrayList<CaptacionEntity> cs = new ArrayList<>();
            cs.add(new CaptacionEntity("AR-24",new Fecha(26,01,2019), hi,hs,20000));
            cs.add(new CaptacionEntity("AR-25",new Fecha(26,01,2019), hi,hs,25000));
            cs.add(new CaptacionEntity("AR-26",new Fecha(26,01,2019), hi,hs,10000));


            captaciones=cs;


            ArrayList<ClienteEntity> ct = new ArrayList<>();
            ct.add(new ClienteEntity("27.345.432","Pedro","Rafael",new Fecha(26,01,2019),new Fecha(20,02,1990),
                    "pedroRafael@gmail.com","24.234.111"));
            ct.add(new ClienteEntity("27.222.432","Ricardo","Lopez",new Fecha(26,01,2019),new Fecha(12,03,1992),
                    "RicardoL@gmail.com","24.234.111"));


            clientes=ct;


            HashMap<String,Boolean> hb = new HashMap<>();
            hb.put("Realizar el contacto con el cliente optante cerrador (de venta o alquiler).",true);
            hb.put("Realizar vía escrita la oferta de cierre (de venta o alquiler)",true);
            hb.put("Prospección con clientes o búsqueda de clientes",true);
            hb.put("Atencion al cliente en las distintas oficinas de SAREN o Alcaldia o SENIAT o cualquier ente que tenga a bien visitar y realizar gestiones para garantizar las operaciones.",true);
            hb.put("Cierre de la Operación con los documentos debidamente firmados y/o protocolizado. ",false);
            hb.put("Post venta (hacerse de los datos para garantizar contacto futuro con el cliente)",false);

            HashMap<String,Integer> hint = new HashMap<>();
            hint.put("27.426.456",30);
            hint.put("19.765.271",15);
            hint.put("24.569.156",30);

            ArrayList<VentaEntity> ve = new ArrayList<>();
            ve.add(new VentaEntity("AR-13","23.902.092",new Fecha(26,01,2019),hint,hb,100,
                    100000,5,0));

            ventas=ve;

            ArrayList<VisitaEntity> vs = new ArrayList<>();
            vs.add(new VisitaEntity("24.098.122","19.098.564","13.982.174","AR-04",
                    new Fecha(26,01,2019),4,20));
            vs.add(new VisitaEntity("21.098.142","21.898.564","17.002.174","AR-07",
                    new Fecha(26,01,2019),8,25));

            visitas=vs;

            //------------------------------------------------------------------------------------------------
            String FILE = "c:/temp/Reporte("+fecha.getDia()+"-"+fecha.getMes()+"-"+fecha.getAnio()+").pdf";
            File file = new File(FILE);
            file.getParentFile().mkdirs();

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
        document.addTitle("Reporte Diario:INMOBILIARIA NOVILIE");
        LocalDate ahora = LocalDate.now();
        document.addSubject("ReporteDiario"+ahora.toString());
        document.addKeywords("Reporte, Diario, pdf");
        document.addAuthor("Novilie");
        document.addCreator("Novilie");
    }

    private void addTitlePage(Document document) throws DocumentException {
        Paragraph preface= new Paragraph();
        Paragraph p = new Paragraph("Fecha:"+ new Date(),smallBold);
        p.setAlignment(Element.ALIGN_RIGHT);
        preface.add(p);

        addEmptyLine(preface, 1);

        p = new Paragraph("REPORTE DE ACTIVIDADES", catFont);
        p.setAlignment(Element.ALIGN_CENTER);
        preface.add(p);

        addEmptyLine(preface, 1);

        p =  new Paragraph("Reporte generado por: "+ this.nombreUsuario, smallBold);
        p.setAlignment(Element.ALIGN_LEFT);
        preface.add(p);

        document.add(preface);

    }

    private void addContent(Document document) throws DocumentException {
        Paragraph preface = new Paragraph();
        addEmptyLine(preface, 1);

        Paragraph p = new Paragraph("CAPTACIONES",subFont);
        p.setAlignment(Element.ALIGN_CENTER);
        preface.add(p);

        addEmptyLine(preface,1);

        CaptacionEntity c;
        for(int i=0;i<this.captaciones.size();i++){
            c=captaciones.get(i);
            p = new Paragraph((i+1)+".- Referencia del inmueble: "+c.getReferenciaInmueble()+"      Comision del Inmueble: "+c.getComisionInmueble()+" Bs.S",smallBold);
            preface.add(p);
            addEmptyLine(preface,1);
            c.getCriteriosAceptacion().forEach((k,v) -> preface.add(new Paragraph("Criterio: " + k + "- Terminado: " + v+"\n",small)));
            addEmptyLine(preface,1);
            c.getCedulaAsesorComision().forEach((k,v) -> preface.add(new Paragraph("Ced.Asesor: " + k + "- PorcentajeCaptacion: " + v+"\n",small)));
            addEmptyLine(preface,1);
        }
        addEmptyLine(preface,2);

        p = new Paragraph("VENTAS",subFont);
        p.setAlignment(Element.ALIGN_CENTER);
        preface.add(p);

        addEmptyLine(preface,1);

        VentaEntity vs;
        for(int i=0;i<this.ventas.size();i++){
            vs=ventas.get(i);
            p = new Paragraph((i+1)+".- Referencia del inmueble: "+vs.getCodInmueble()+"      Cedula ClienteComprador: "+vs.getCedulaCliente(),smallBold);
            preface.add(p);
            addEmptyLine(preface,1);
            vs.getCriteriosCierre().forEach((k,v) -> preface.add(new Paragraph("Criterio: " + k + "- Terminado: " + v+"\n",small)));
            addEmptyLine(preface,1);
            vs.getCedulaAsesorComision().forEach((k,v) -> preface.add(new Paragraph("Ced.Asesor: " + k + "- PorcentajeCierre: " + v+"\n",small)));
            addEmptyLine(preface,1);
        }
        addEmptyLine(preface,2);

        p = new Paragraph("NUEVOS CLIENTES",subFont);
        p.setAlignment(Element.ALIGN_CENTER);
        preface.add(p);

        addEmptyLine(preface,1);

        ClienteEntity cli;
        for(int i=0;i<this.clientes.size();i++){
            cli=clientes.get(i);
            p = new Paragraph((i+1)+".- CedulaAsesorEncargado: "+cli.getCedulaAsesorEncargado()+"      CedulaCliente: "+cli.getCedula()+"   NombreApellido: "+cli.getNombre()+" "+cli.getApellido(),smallBold);
            preface.add(p);
            p = new Paragraph("       Correo: "+cli.getEmail()+"       FechaNacimeinto: "+cli.getFechaNacimiento().getDia()+"/"+cli.getFechaNacimiento().getMes()+"/"+cli.getFechaNacimiento().getAnio(),small);
            preface.add(p);
            addEmptyLine(preface,1);
        }
        addEmptyLine(preface,2);

        p = new Paragraph("VISITAS",subFont);
        p.setAlignment(Element.ALIGN_CENTER);
        preface.add(p);

        addEmptyLine(preface,1);

        VisitaEntity vi;
        for(int i=0;i<this.visitas.size();i++){
            vi=visitas.get(i);
            p = new Paragraph((i+1)+".- CedulaAsesorEncargado: "+vi.getCedulaAsesor()+"      CedulaClientePotencial: "+vi.getCedulaClientePotencial()+"      CedulaClientePropietario: "+vi.getCedulaPropietario(),smallBold);
            preface.add(p);
            p = new Paragraph("   Referencia del Inmueble: "+vi.getReferenciaInmueble()+"       Hora Visita: "+vi.getHoraVisita()+":"+vi.getMinVisita(),small);
            preface.add(p);
            addEmptyLine(preface,1);
        }

        document.add(preface);


    }

    private static void addEmptyLine(Paragraph paragraph, int number) {
        for (int i = 0; i < number; i++) {
            paragraph.add(new Paragraph(" "));
        }
    }
}
