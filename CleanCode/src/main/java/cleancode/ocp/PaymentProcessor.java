package cleancode.ocp;

public class PaymentProcessor {
    public void processPayment(Payable payType, double amount) {
        payType.pay(amount);
    }
}
