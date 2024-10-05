import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double walletAmount = 400000.0;
        List<Double> wallet = new ArrayList<>();
        Random random = new Random();

        boolean processing = true;

        while (processing) {

            System.out.printf("Current wallet amount: %.2f KZT%n", walletAmount);
            System.out.println("-------------------");

            double amountToPay = 100 + (20000 - 100) * random.nextDouble();
            System.out.printf("The product price is: %.2f KZT%n", amountToPay);
            System.out.println("-------------------");

            System.out.println("Choose a payment method:");
            System.out.println("1. Credit Card");
            System.out.println("2. PayPal");
            System.out.println("3. Bank Transfer");
            System.out.println("4. Exit and Show Wallet");
            int choice = scanner.nextInt();


            if (choice == 4) {
                processing = false;
                break;
            }


            if (walletAmount < amountToPay) {
                System.out.println("Not enough money! Payment cannot be completed for: " + amountToPay + " KZT");
                continue;
            }


            PaymentMethod paymentMethod = null;

            switch (choice) {
                case 1:
                    paymentMethod = new CreditCardPayment();
                    break;
                case 2:
                    paymentMethod = new PayPalPayment();
                    break;
                case 3:
                    paymentMethod = new BankTransferPayment();
                    break;
                default:
                    System.out.println("Invalid choice, please try again.");
                    continue;
            }


            paymentMethod.collectPaymentDetails();


            PaymentProcessor paymentProcessor = new PaymentProcessor();
            paymentProcessor.process(paymentMethod, amountToPay);


            walletAmount -= amountToPay;
            wallet.add(amountToPay);
            System.out.printf("Processed payment of: %.2f KZT%n", amountToPay);
        }


        System.out.println("\n--- Wallet Summary ---");
        double totalAmount = 0;
        for (double processedAmount : wallet) {
            System.out.printf("Processed payment: %.2f KZT%n", processedAmount);
            totalAmount += processedAmount;
        }
        System.out.printf("Total processed amount: %.2f KZT%n", totalAmount);
        System.out.printf("Remaining wallet amount: %.2f KZT%n", walletAmount);

        scanner.close();
    }
}
