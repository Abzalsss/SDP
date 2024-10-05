import java.util.Scanner;

public class CreditCardPayment implements PaymentMethod {
    private String cardNumber;
    private String cardHolderName;
    private String expirationDate;
    private String cvv;

    @Override
    public void collectPaymentDetails() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter card number:");
        cardNumber = scanner.nextLine();

        System.out.println("Enter cardholder name:");
        cardHolderName = scanner.nextLine();

        System.out.println("Enter card expiration date (MM/YY):");
        expirationDate = scanner.nextLine();

        System.out.println("Enter CVV code:");
        cvv = scanner.nextLine();
    }

    @Override
    public void processPayment(double amount) {
        System.out.printf("Processing credit card payment of %.2f KZT%n", amount);
        System.out.println("Card Number: " + cardNumber);
        System.out.println("Expiration Date: " + expirationDate);
        System.out.println("CVV: " + cvv);
    }
}
