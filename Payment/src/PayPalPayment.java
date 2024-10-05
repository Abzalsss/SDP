import java.util.Scanner;


public class PayPalPayment implements PaymentMethod {
    private String email;
    private String password;

    @Override
    public void collectPaymentDetails() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter PayPal email:");
        email = scanner.nextLine();

        System.out.println("Enter PayPal password:");
        password = scanner.nextLine();
    }

    @Override
    public void processPayment(double amount) {

        System.out.printf("Processing PayPal payment of %.2f KZT%n", amount);

        System.out.println("PayPal Email: " + email);
    }
}
