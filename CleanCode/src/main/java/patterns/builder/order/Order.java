package patterns.builder.order;

import patterns.facade.house.Light;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<String> products;
    private int discount;
    private String paymentMethod;

    public Order(List<String> products, int discount, String paymentMethod) {
        this.products = products;
        this.discount = discount;
        this.paymentMethod = paymentMethod;
    }

    public Order(Builder builder) {
        this.products = builder.products;
        this.discount = builder.discount;
        this.paymentMethod = builder.paymentMethod;
    }

    @Override
    public String toString() {
        return "Order{" +
                "products=" + products +
                ", discount=" + discount +
                ", paymentMethod='" + paymentMethod + '\'' +
                '}';
    }

    static class Builder {
        private List<String> products = new ArrayList<>();
        private int discount;
        private String paymentMethod;

        public Builder setProducts(String products) {
            this.products.add(products);
            return this;
        }

        public Builder setDiscount(int discount) {
            this.discount = discount;
            return this;
        }

        public Builder setPaymentMethod(String paymentMethod) {
            this.paymentMethod = paymentMethod;
            return this;
        }

        public Order build() {
            return new Order(this);
        }
    }
}
