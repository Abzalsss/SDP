public class SMSNotification implements Notification {
    @Override
    public void send(String message, String recipient) {
        System.out.printf("Sending SMS to %s: %s%n", recipient, message);
    }
}

