package RankmfBase;


import java.util.*;

import javax.activation.DataHandler;
import javax.activation.FileDataSource;
import javax.mail.*; 
import javax.mail.internet.*;
import javax.sql.DataSource;

import org.testng.ITestResult; 

public class Email_sent {
	
	


		
	public static void Email_send() {

		// Create object of Property file
		Properties props = new Properties();

		// this will set host of server- you can change based on your requirement 
		props.put("mail.smtp.host", "smtp.gmail.com");

		// set the port of socket factory 
		props.put("mail.smtp.socketFactory.port", "465");

		// set socket factory
		props.put("mail.smtp.socketFactory.class","javax.net.ssl.SSLSocketFactory");

		// set the authentication to true
		props.put("mail.smtp.auth", "true");

		// set the port of SMTP server
		props.put("mail.smtp.port", "465");

		// This will handle the complete authentication
		Session session = Session.getDefaultInstance(props,

				new javax.mail.Authenticator() {

					protected PasswordAuthentication getPasswordAuthentication() {

					return new PasswordAuthentication("ravindrac121777@gmail.com", "ygdadgehemdcauwz");

					}

				});

		try {

			// Create object of MimeMessage class
			Message message = new MimeMessage(session);

			// Set the from address
			message.setFrom(new InternetAddress("ravindrac121777@gmail.com"));

			// Set the recipient address
			//message.setRecipients(Message.RecipientType.TO,InternetAddress.parse("ravindrac121777@gmail.com"));
			message.setRecipients(Message.RecipientType.CC,InternetAddress.parse("ravindrac121777@gmail.com,rajesh.kadam@samco.in"));
            
                        // Add the subject link
			message.setSubject("RANKMF Automation HTML Report");

			// Create object to add multimedia type content
			BodyPart messageBodyPart1 = new MimeBodyPart();

			// Set the body of email
			messageBodyPart1.setText("This is message body");

			// Create another object to add another content
			MimeBodyPart messageBodyPart2 = new MimeBodyPart();

			// Mention the file which you want to send
			String filename = "./Reports/RANKMF.html";
			String logfile = "./log/application.html";
			
			

			// Create data source and pass the filename
			FileDataSource source = new FileDataSource(filename);
			FileDataSource logs = new FileDataSource(logfile);
			
			
		

			// set the handler
			messageBodyPart2.setDataHandler(new DataHandler(source));
			messageBodyPart1.setDataHandler(new DataHandler(logs));

			// set the file
			messageBodyPart2.setFileName(filename);
			messageBodyPart1.setFileName(logfile);
			
			
			// Create object of MimeMultipart class
			Multipart multipart = new MimeMultipart();

			// add body part 1
			multipart.addBodyPart(messageBodyPart2);

			// add body part 2
			multipart.addBodyPart(messageBodyPart1);

			// set the content
			message.setContent(multipart);

			// finally send the email
			Transport.send(message);

			System.out.println("=====Email Sent=====");

		} catch (MessagingException e) {

			throw new RuntimeException(e);

		}

	}
	
	 public static void email_send()
	 {
			
			
			Email_sent.Email_send();
			System.out.println("Test Passed and email send\n");
		
	 }

	

}
 


	