package Email_Module;

import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;


public class Email_prueba {


    public static void main(String[] args) {
    String destinatario =  "mauricio1999morales@gmail.com"; //A quien le quieres escribir.
    String asunto = "Correo de prueba enviado desde Java";
    String cuerpo = "Esta es una prueba de correo...";

    enviarConGMail(destinatario, asunto, cuerpo);
    }


        
    private static void enviarConGMail(String destinatario, String asunto, String cuerpo) {
     //  private final Properties properties = new Properties();
        
        final String username="novillieprueba@gmail.com";
	
        final String password="casabius";
    // Esto es lo que va delante de @gmail.com en tu cuenta de correo. Es el remitente también.
    String remitente = "novillieprueba@gmail.com";  //Para la dirección nomcuenta@gmail.com

    Properties props = System.getProperties();
    props.put("mail.smtp.host", "smtp.gmail.com");  //El servidor SMTP de Google
    props.put("mail.smtp.user", "novillieprueba@gmail.com");
    props.put("mail.smtp.clave", "password");    //La clave de la cuenta
    props.put("mail.smtp.auth", "true");    //Usar autenticación mediante usuario y clave
    props.put("mail.smtp.starttls.enable", "true"); //Para conectar de manera segura al servidor SMTP
    props.put("mail.smtp.port", "587"); //El puerto SMTP seguro de Google
    		
    Session session = Session.getInstance(props,
                    new javax.mail.Authenticator() {
                     protected PasswordAuthentication
                        getPasswordAuthentication() {
                            return new PasswordAuthentication(username, password);
                            }
                            });
    
    MimeMessage message = new MimeMessage(session);

    try {
        message.setFrom(new InternetAddress("novillieprueba@gmail.com"));
        message.addRecipient(Message.RecipientType.TO,new InternetAddress(destinatario));   //Se podrían añadir varios de la misma manera
        message.setSubject(asunto);
        message.setText(cuerpo);
        Transport transport = session.getTransport("smtp");
        transport.connect("smtp.gmail.com", "novillieprueba@gmail.com", password);
        transport.sendMessage(message, message.getAllRecipients());
        transport.close();
    }
    catch (MessagingException me) {
        me.printStackTrace();   //Si se produce un error
    }
     }  
}
