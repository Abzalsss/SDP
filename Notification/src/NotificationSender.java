import java.util.List;

public class NotificationSender {

    public void sendNotification(Notification notification, String message, String recipient) {
        notification.send(message, recipient);
    }

    public void sendBulkNotification(Notification notification, String message, List<String> recipients) {
        for (String recipient : recipients) {
            sendNotification(notification, message, recipient);
        }
    }
}
