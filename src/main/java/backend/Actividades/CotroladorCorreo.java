package backend.Actividades;

import java.util.Properties;
import javax.activation.DataHandler;
import javax.activation.FileDataSource;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

public class CotroladorCorreo {
    private final Properties properties = new Properties();

    private boolean enviarCorreo( Correo c) {
        try {
            properties.put("mail.smtp.host", "mail.gmail.com");
            properties.put("mail.smtp.starttls.enable", "true");
            properties.put("mail.smtp.port",587);
            properties.put("mail.smtp.mail.sender", c.getCorreoEmisor());
            properties.put("mail.smtp.auth", "true");

            Session s = Session.getDefaultInstance(properties,null);

            BodyPart texto = new MimeBodyPart();
            ((MimeBodyPart) texto).setText(c.getMensaje());

            BodyPart adjunto = new MimeBodyPart();
            if (!c.getRutaArchivo().equals("")){
                adjunto.setDataHandler(new DataHandler(new FileDataSource(c.getRutaArchivo())));
                adjunto.setFileName(c.getNombreArchivo()) ;
            }
            MimeMultipart m= new MimeMultipart();
            m.addBodyPart(texto);
            if(!c.getRutaArchivo().equals("")){
                m.addBodyPart(adjunto);
            }

            MimeMessage message = new MimeMessage(s);
            message.setFrom(new InternetAddress(c.getCorreoEmisor()));
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(c.getCorreoReceptor()));
            message.setSubject(c.getAsunto());
            message.setContent(m);

            Transport t = s.getTransport("smtp");
            t.connect(c.getCorreoEmisor(), c.getContrasenia());
            t.sendMessage(message, message.getAllRecipients());
            t.close();
            return true;
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }
    public static void main(String[] args) {
        Correo c = new Correo();
        c.setCorreoEmisor("mauricio1999morales@gmail.com");
        c.setContrasenia("panconques");
        c.setCorreoReceptor("mauricio1999morales@gmail.com");
        c.setAsunto("Pruebis");
        c.setMensaje("Alo wenas");
        c.setNombreArchivo("");
        c.setRutaArchivo("");

        CotroladorCorreo controller = new CotroladorCorreo();
        if( controller.enviarCorreo(c))
            System.out.println("Se ha enviado Correctamente");
        else
            System.out.println("No se pudo enviar Correctamente");
    }

}