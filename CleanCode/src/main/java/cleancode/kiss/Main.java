package cleancode.kiss;

public class Main {
    static void main(String[] args) {
        DiscountCalculator discountCalculator = new DiscountCalculator();
        double discount = discountCalculator.calculateDiscount(100, true, true, false);
        System.out.println(discount);
    }
}
