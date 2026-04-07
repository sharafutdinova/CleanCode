package cleancode.ocp;

public class Bitcoin implements Payable {
    @Override
    public void pay(double amount) {
        System.out.println("Оплата Bitcoin на сумму " + amount);
    }
}
