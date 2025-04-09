package org.example;

public abstract class Notification {
    String recipient;
    String message;

    public Notification(String recipient, String message) {
        this.recipient = recipient;
        this.message = message;
    }

    public abstract void send();

    public void displayInfo() {
        System.out.println("Sending to: " + recipient);
        System.out.println("Message: " + message);
    }
}