/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mail;


import java.io.UnsupportedEncodingException;
import java.util.Properties;
import javax.activation.DataHandler;
import javax.activation.FileDataSource;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.swing.JOptionPane;




/**
 *
 * @author dylan_p1fbiqx
 */
public class Mail {
    Properties propiedad = new Properties();

    public void propiedades() {
        propiedad.setProperty("mail.smtp.host", "smtp.gmail.com");
        propiedad.setProperty("mail.smtp.starttls.enable", "true");
        propiedad.setProperty("mail.smtp.port", "587");
        propiedad.setProperty("mail smtp auth", "true");
    }
    
    
    
    public void enviarMail(String correo, String codigo) throws UnsupportedEncodingException, MessagingException {
        propiedades();
        Session sesion = Session.getDefaultInstance(propiedad);
        String correoEnvia = "correo";
        String contrasena = "contraseña";
        String receptor = correo;
        String asunto = "Cambio de Contraseña";
        String mensaje = "Su codigo es: " + codigo;   
        MimeMessage mail = new MimeMessage(sesion);
        
        try {
            mail.setFrom(new InternetAddress(correoEnvia));
            mail.addRecipient(Message.RecipientType.TO, new InternetAddress(receptor,correoEnvia));
            mail.setSubject(asunto);
            mail.setText(mensaje);
            
            Transport transporte = sesion.getTransport("smtp");
            transporte.connect(correoEnvia, contrasena);
            transporte.sendMessage(mail, mail.getRecipients(Message.RecipientType.TO));
            transporte.close();

            JOptionPane.showMessageDialog(null, "Correo enviado");
        } catch (AddressException ex) {
            JOptionPane.showMessageDialog(null, "Correo  no enviado" + ex);
        }
    }
    
    public void enviarFactura(String correo,String num) throws UnsupportedEncodingException, MessagingException {
        propiedades();
        Session sesion = Session.getDefaultInstance(propiedad);
        String correoEnvia = "correo";
        String contrasena = "pass";
        String receptor = correo;
        String asunto = "Factura";
        String mensaje = "!Muchas gracias por su compra!";   
        MimeMessage mail = new MimeMessage(sesion);
        
        try {
            mail.setFrom(new InternetAddress(correoEnvia));
            mail.addRecipient(Message.RecipientType.TO, new InternetAddress(receptor,correoEnvia));
            mail.setSubject(asunto);
            mail.setText(mensaje);
            BodyPart adjunto = new MimeBodyPart();
            adjunto.setDataHandler(new DataHandler(new FileDataSource("src\\reporte\\report"+num+".pdf")));
            adjunto.setFileName("report.pdf");
            MimeMultipart multiParte = new MimeMultipart();
            multiParte.addBodyPart(adjunto);
            mail.setContent(multiParte);
            
            Transport transporte = sesion.getTransport("smtp");
            transporte.connect(correoEnvia, contrasena);
            transporte.sendMessage(mail, mail.getRecipients(Message.RecipientType.TO));
            transporte.close();

            JOptionPane.showMessageDialog(null, "Correo enviado");
        } catch (AddressException ex) {
            JOptionPane.showMessageDialog(null, "Correo  no enviado" + ex);
        }
    }
}
