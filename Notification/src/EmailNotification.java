public class EmailNotification implements Notification {
    @Override
    public void send(String message, String recipient) {
        System.out.printf("Sending Email to %s: %s%n", recipient, message);
    }
}
