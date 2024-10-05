import java.util.Scanner;

public class BankTransferPayment implements PaymentMethod {
    private String bankAccountNumber;
    private String bankName;

    @Override
    public void collectPaymentDetails() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter bank account number:");
        bankAccountNumber = scanner.nextLine();

        System.out.println("Enter bank name:");
        bankName = scanner.nextLine();
    }

    @Override
    public void processPayment(double amount) {
        System.out.printf("Processing bank transfer payment of %.2f KZT%n", amount);
        System.out.println("Bank Account Number: " + bankAccountNumber);
        System.out.println("Bank Name: " + bankName);
    }
}
