import java.util.Properties;
import java.util.Scanner;

import jakarta.mail.*;
import jakarta.mail.internet.*;

public class EmailSenderApp {

    public static void main(String[] args) {

        // Sender email and app password
        final String senderEmail = "your_email@gmail.com";
        final String appPassword = "your_app_password";

        // Get input from user
        Scanner sc = new Scanner(System.in);

        System.out.print("Sent To: ");
        String to = sc.nextLine();

        System.out.print("Subject: ");
        String subject = sc.nextLine();

        System.out.print("Message: ");
        String messageText = sc.nextLine();

        // SMTP Properties
        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");

        // Create Session
        Session session = Session.getInstance(props, new Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(senderEmail, appPassword);
            }
        });

        try {
            // Create Message
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(senderEmail));
            message.setRecipients(
                    Message.RecipientType.TO,
                    InternetAddress.parse(to)
            );
            message.setSubject(subject);
            message.setText(messageText);

            // Send Email
            Transport.send(message);

            System.out.println("Mail sent successfully!");

        } catch (Exception e) {
            System.out.println("Error sending mail: " + e.getMessage());
        }

        sc.close();
    }
}