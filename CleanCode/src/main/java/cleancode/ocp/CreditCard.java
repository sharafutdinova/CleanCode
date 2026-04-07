package cleancode.ocp;

public class CreditCard implements Payable{
    @Override
    public void pay(double amount) {
        System.out.println("Оплата кредитной картой на сумму " + amount);
    }
}
