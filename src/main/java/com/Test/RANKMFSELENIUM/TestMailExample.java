package com.Test.RANKMFSELENIUM;

import jakarta.mail.*;
import jakarta.mail.internet.*;

import java.util.Properties;
import java.util.Random;

public class TestMailExample {

    public static void main(String[] args) {

        // Gmail credentials
        final String username = "ravindrac202@gmail.com";
        final String password = "fkcimxmtryqqqsxo"; // Use App Password, not Gmail password

        // Recipient email
        String toEmail = "alerts@rankmfalerts.samco.in";

        // Generate OTP
        int otp = new Random().nextInt(900000) + 100000; // 6-digit OTP

        // Mail server properties
        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");

        // Get session
        Session session = Session.getInstance(props, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username, password);
            }
        });

        try {
            // Create message
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(username));
            message.setRecipients(
                    Message.RecipientType.TO,
                    InternetAddress.parse(toEmail)
            );
            message.setSubject("Your OTP Code");
            message.setText("Your OTP is: " + otp);

            // Send message
            Transport.send(message);

            System.out.println("OTP sent successfully: " + otp);

        } catch (MessagingException e) {
            e.printStackTrace();
        }
    }
}
