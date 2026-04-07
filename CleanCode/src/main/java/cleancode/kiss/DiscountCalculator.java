package cleancode.kiss;

public class DiscountCalculator {
    private final double DISCOUNT_FOR_FIRST_PURCHASE_FOR_LOYALTY = 0.10;
    private final double DISCOUNT_FOR_REPEATED_PURCHASE_FOR_LOYALTY = 0.05;
    private final double DISCOUNT_FOR_PURCHASE_WITH_COUPON = 0.07;
    private final double DISCOUNT_FOR_PURCHASE_WITHOUT_COUPON = 0.02;

    public double calculateDiscount(double price, boolean isLoyalCustomer, boolean isFirstPurchase, boolean hasCoupon) {
        double discount = 0.0;
        if (isLoyalCustomer) {
            discount = isFirstPurchase ? DISCOUNT_FOR_FIRST_PURCHASE_FOR_LOYALTY : DISCOUNT_FOR_REPEATED_PURCHASE_FOR_LOYALTY;
        } else {
            discount = hasCoupon ? DISCOUNT_FOR_PURCHASE_WITH_COUPON : DISCOUNT_FOR_PURCHASE_WITHOUT_COUPON;
        }
        return price - discount * price;
    }
}
