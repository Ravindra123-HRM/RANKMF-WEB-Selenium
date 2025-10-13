package RankmfBase;

import java.util.Properties;
import jakarta.activation.DataHandler;
import jakarta.activation.FileDataSource;
import jakarta.mail.*;
import jakarta.mail.internet.*;

public class Email_sent {

    public static void main(String[] args) {
        // SMTP configuration
        Properties props = new Properties();
        props.put("mail.transport.protocol", "smtp");
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");

        // Gmail App Password authentication
        final String from = "ravindrac2871990@gmail.com";
        final String password = "jpep iqou dnjf hcys"; // 16-char app password

        Session session = Session.getInstance(props, new Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(from, password);
            }
        });

        try {
            // Create email
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(from));
            message.setRecipients(
                Message.RecipientType.TO,
                InternetAddress.parse("ravindrac2871990@gmail.com") // <-- put actual recipients here
            );
            message.setSubject("RANKMF Automation HTML Report");

            // Body part (text)
            MimeBodyPart bodyPart = new MimeBodyPart();
            bodyPart.setText("Dear Team,\n\nPlease find attached the automation reports.\n\nRegards,\nAutomation Bot");

            // Attachments
            MimeBodyPart reportPart = new MimeBodyPart();
            String reportFile = "./Reports/RANKMF.html";
            reportPart.setDataHandler(new DataHandler(new FileDataSource(reportFile)));
            reportPart.setFileName("RANKMF.html");

            MimeBodyPart logPart = new MimeBodyPart();
            String logFile = "./log/application.html";
            logPart.setDataHandler(new DataHandler(new FileDataSource(logFile)));
            logPart.setFileName("application.html");

            // Combine into multipart
            Multipart multipart = new MimeMultipart();
            multipart.addBodyPart(bodyPart);
            multipart.addBodyPart(reportPart);
            multipart.addBodyPart(logPart);

            message.setContent(multipart);

            // Send
            Transport.send(message);

            System.out.println("✅ Email Sent Successfully!");

        } catch (Exception e) {
            e.printStackTrace();
            System.err.println("❌ Email sending failed: " + e.getMessage());
}
    }
}