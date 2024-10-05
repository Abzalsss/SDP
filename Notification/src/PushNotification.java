public class PushNotification implements Notification {
    @Override
    public void send(String message, String recipient) {
        System.out.printf("Sending Push Notification to %s: %s%n", recipient, message);
    }
}
