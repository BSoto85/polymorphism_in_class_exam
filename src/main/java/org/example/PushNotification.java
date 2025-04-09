package org.example;

public class PushNotification extends Notification {
    String token;

    public PushNotification(String recipient, String message, String token) {
        super(recipient, message);
        this.token = token;
    }

    @Override
    public void send() {
        System.out.println("Sending to: " + recipient);
        System.out.println("Push notification content: " + message);
        System.out.println("Connecting to push notification service...");
        System.out.println("Sending push notification...");
    }
}
