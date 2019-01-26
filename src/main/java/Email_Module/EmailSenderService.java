package Email_Module;

import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
 
public class EmailSenderService {
	private final Properties properties = new Properties();
        
        private final String username="novillieprueba@gmail.com";
	
	private final String password="casabius";
 
	//private Session session;
        
    private void enviarConGMail(String destinatario, String asunto, String cuerpo) {
    // Esto es lo que va delante de @gmail.com en tu cuenta de correo. Es el remitente también.
    String remitente = "novillieprueba";  //Para la dirección nomcuenta@gmail.com

    Properties props = System.getProperties();
    props.put("mail.smtp.host", "smtp.gmail.com");  //El servidor SMTP de Google
    props.put("mail.smtp.user", remitente);
    props.put("mail.smtp.clave", "password");    //La clave de la cuenta
    props.put("mail.smtp.auth", "true");    //Usar autenticación mediante usuario y clave
    props.put("mail.smtp.starttls.enable", "true"); //Para conectar de manera segura al servidor SMTP
    props.put("mail.smtp.port", "587"); //El puerto SMTP seguro de Google

    Session session = Session.getDefaultInstance(props);
    MimeMessage message = new MimeMessage(session);

    try {
        message.setFrom(new InternetAddress(remitente));
        message.addRecipient(Message.RecipientType.TO,new InternetAddress(destinatario));   //Se podrían añadir varios de la misma manera
        message.setSubject(asunto);
        message.setText(cuerpo);
        Transport transport = session.getTransport("smtp");
        transport.connect("smtp.gmail.com", remitente, password);
        transport.sendMessage(message, message.getAllRecipients());
        transport.close();
    }
    catch (MessagingException me) {
        me.printStackTrace();   //Si se produce un error
    }
}
        
        

    /*    
    public EmailSenderService() {
        sendEmail();
    }
 
        
        
	private void init() {
 
		properties.put("mail.smtp.host", "smtp.gmail.com");
		properties.put("mail.smtp.starttls.enable", "true");
		properties.put("mail.smtp.port",587);
                properties.put("mail.smtp.auth", "true");
		properties.put("mail.smtp.mail.sender","novillieprueba@gmail.com");
		properties.put("mail.smtp.user", "novillieprueba");

 
		session = Session.getInstance(properties,
                    new javax.mail.Authenticator() {
                     protected PasswordAuthentication
                        getPasswordAuthentication() {
                            return new PasswordAuthentication(username, password);
                            }
                            });
	}
 
	public void sendEmail(){
 
		init();
		try{
			MimeMessage message = new MimeMessage(session);
			message.setFrom(new InternetAddress((String)properties.get("mail.smtp.mail.sender")));
			message.addRecipient(Message.RecipientType.TO, new InternetAddress("novillieprueba@gmail.com"));
			message.setSubject("Prueba");
			message.setText("hola amigito esto no es una jojo referencia xddddddddd");
                        Transport.send(message);
			//Transport t = session.getTransport("smtp");
			//t.connect((String)properties.get("mail.smtp.user"), "password");
			//t.sendMessage(message, message.getAllRecipients());
			//t.close();
		}catch (MessagingException me){
                    System.out.println(me.getMessage());
			return;
		}
		
	} */
 
}
