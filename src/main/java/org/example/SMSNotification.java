package org.example;

public class SMSNotification extends Notification {

    public SMSNotification(String recipient, String message) {
        super(recipient, message);
    }

    @Override
    public void send() {
        System.out.println("Sending to: " + recipient);
        System.out.println("SMS content: " + message);
        System.out.println("Connecting to SMS gateway...");
        System.out.println("Sending SMS...");
    }
}