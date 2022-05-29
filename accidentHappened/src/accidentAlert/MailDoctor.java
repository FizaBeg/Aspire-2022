package accidentAlert;

import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class MailDoctor {
	public void contactDoctor() throws Exception {
		System.out.println("Preparing to send email...");
	      // Put recipient�s address
	      String to = "fizabeg20@gmail.com";

	      // Put sender�s address
	      String from = "from@example.com";
	      final String username = "fizabegamh@gmail.com";//username generated by Mailtrap
	      final String password = "fiza1055";//password generated by Mailtrap

	      // Paste host address from the SMTP settings tab in your Mailtrap Inbox
	      String host = "smtp.gmail.com";

	      Properties props = new Properties();
	      props.put("mail.smtp.auth", "true");
	      props.put("mail.smtp.starttls.enable", "true");//it�s optional in Mailtrap
	      props.put("mail.smtp.host", host);
	      props.put("mail.smtp.port", "587");// use one of the options in the SMTP settings tab in your Mailtrap Inbox

	      // Get the Session object.
	      Session session = Session.getInstance(props,
	         new Authenticator() {
	            protected PasswordAuthentication getPasswordAuthentication() {
	               return new PasswordAuthentication(username, password);
	    }
	         });
	      
	      Message message = prepareMessage(session, username, to);
	      
	   // Send message
	      Transport.send(message);

	      System.out.println("Sent email message successfully....");
	   }

	private static Message prepareMessage(Session session, String username, String to) {
		// TODO Auto-generated method stub
		try {
		// Create a default MimeMessage object.
	    Message message = new MimeMessage(session);
	    
	 // Set From: header field
	    message.setFrom(new InternetAddress(username));

	    // Set To: header field
	    message.setRecipients(Message.RecipientType.TO,
	               InternetAddress.parse(to));
		
		 // Set Subject: header field
	    message.setSubject("My first message with JavaMail");

	    // Put the content of your message
	    message.setText("Hi Doctor, \n There is a call from passenger from highway xyz.");

	    return message;
		}
		catch(Exception ex)
		{
			Logger.getLogger(AlertMail.class.getName()).log(Level.SEVERE, null, ex);
		}
		return null;
		}
	}


