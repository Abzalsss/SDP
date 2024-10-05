
public interface PaymentMethod {
    void collectPaymentDetails();
    void processPayment(double amount);
}
