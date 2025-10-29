package com.Test.RANKMFSELENIUM;


import jakarta.mail.*;
import jakarta.mail.internet.MimeMultipart;
import java.util.Properties;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailOTPReader {

    public static String fetchOTP(String host, String user, String password, String subjectKeyword) {
        String otp = null;

        try {
            // Email configuration
            Properties properties = new Properties();
            properties.put("mail.store.protocol", "imaps");
            properties.put("mail.imaps.host", host);
            properties.put("mail.imaps.port", "993");
            properties.put("mail.imaps.ssl.enable", "true");

            Session session = Session.getDefaultInstance(properties);
            Store store = session.getStore("imaps");
            store.connect(host, user, password);

            Folder inbox = store.getFolder("INBOX");
            inbox.open(Folder.READ_ONLY);

            Message[] messages = inbox.getMessages();
            System.out.println("📩 Total Emails: " + messages.length);

            // Start from latest email
            for (int i = messages.length - 1; i >= 0; i--) {
                Message message = messages[i];
                String subject = message.getSubject();

                if (subject != null && subject.contains(subjectKeyword)) {
                    System.out.println("✅ Found Email with Subject: " + subject);

                    String body = getTextFromMessage(message);

                    // Extract OTP using regex (digits of 4-8 length)
                    Pattern p = Pattern.compile("\\b\\d{4,8}\\b");
                    Matcher m = p.matcher(body);
                    if (m.find()) {
                        otp = m.group();
                        System.out.println("🔐 Extracted OTP: " + otp);
                        break;
                    }
                }
            }

            inbox.close(false);
            store.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return otp;
    }

    private static String getTextFromMessage(Message message) throws Exception {
        if (message.isMimeType("text/plain")) {
            return message.getContent().toString();
        } else if (message.isMimeType("multipart/*")) {
            MimeMultipart mimeMultipart = (MimeMultipart) message.getContent();
            return getTextFromMimeMultipart(mimeMultipart);
        }
        return "";
    }

    private static String getTextFromMimeMultipart(MimeMultipart mimeMultipart) throws Exception {
        StringBuilder result = new StringBuilder();
        int count = mimeMultipart.getCount();
        for (int i = 0; i < count; i++) {
            BodyPart bodyPart = mimeMultipart.getBodyPart(i);
            if (bodyPart.isMimeType("text/plain")) {
                result.append(bodyPart.getContent());
            } else if (bodyPart.isMimeType("text/html")) {
                String html = (String) bodyPart.getContent();
                result.append(html.replaceAll("<[^>]*>", "")); // remove HTML tags
            }
        }
        return result.toString();
    }
}
