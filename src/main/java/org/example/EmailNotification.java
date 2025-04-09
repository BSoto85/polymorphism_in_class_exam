package org.example;

public class EmailNotification extends Notification {

    public EmailNotification(String recipient, String message) {
        super(recipient, message);
    }

    @Override
    public void send() {
        System.out.println("Sending to: " + recipient);
        System.out.println("Email content: " + message);
        System.out.println("Connecting to SMTP server...");
        System.out.println("Sending email...");
    }
}
