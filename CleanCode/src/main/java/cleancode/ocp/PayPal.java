package cleancode.ocp;

public class PayPal implements Payable {
    @Override
    public void pay(double amount) {
        System.out.println("Оплата через PayPal на сумму " + amount);
    }
}
