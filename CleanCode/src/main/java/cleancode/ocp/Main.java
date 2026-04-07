package cleancode.ocp;

public class Main {
    static void main(String[] args) {
        PaymentProcessor paymentProcessor = new PaymentProcessor();
        Payable creditCard = new CreditCard();
        Payable bitcoin = new Bitcoin();
        paymentProcessor.processPayment(creditCard, 132.50);
        paymentProcessor.processPayment(bitcoin, 1000.00);
    }
}
