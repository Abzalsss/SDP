import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Notification smsNotification = new SMSNotification();
        Notification emailNotification = new EmailNotification();
        Notification pushNotification = new PushNotification();


        System.out.println("Choose a notification type:");
        System.out.println("1. SMS");
        System.out.println("2. Email");
        System.out.println("3. Push Notification");
        int choice = scanner.nextInt();
        scanner.nextLine();

        String recipient = "";
        String message;


        switch (choice) {
            case 1:
                System.out.print("Enter the phone number: ");
                recipient = scanner.nextLine();
                System.out.print("Enter your message: ");
                message = scanner.nextLine();
                smsNotification.send(message, recipient);
                break;
            case 2:
                System.out.print("Enter the email address: ");
                recipient = scanner.nextLine();
                System.out.print("Enter your message: ");
                message = scanner.nextLine();
                emailNotification.send(message, recipient);
                break;
            case 3:
                System.out.print("Enter the username: ");
                recipient = scanner.nextLine();
                System.out.print("Enter your message: ");
                message = scanner.nextLine();
                pushNotification.send(message, recipient);
                break;
            default:
                System.out.println("Invalid choice. Please select a valid notification type.");
        }

        scanner.close();
    }
}
