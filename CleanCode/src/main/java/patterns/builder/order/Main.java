package patterns.builder.order;

public class Main {
    //    Описание
//    В интернет-магазине клиент может оформить заказ, добавляя товары, указывая скидку и выбирая способ оплаты.
//    Паттерн Builder поможет организовать процесс формирования заказа, не перегружая конструктор класса Order
//    множеством параметров. Это позволяет строить объекты заказов поэтапно, добавляя товары, скидки и способы оплаты по мере необходимости.
    static void main(String[] args) {
        Order order = new Order.Builder()
                .setProducts("Apple")
                .setProducts("Orange")
                .setDiscount(10)
                .setPaymentMethod("Card")
                .build();
        System.out.println(order);
    }
}
