package lessons.patterns.creational.fabricmethod;

/**
 * Класс для управления логистикой доставок
 */
public abstract class Logistics {
    // метод реализует способ создания транспорта
    abstract Transport createTransport();

    public void planDeleivery() {
        Transport transport = createTransport();
        transport.deliver();
    }
}
