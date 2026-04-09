package patterns.fabricmethod.transports;

public class Main {
    //    Описание
//    В этом приложении нам нужно создать систему для создания различных типов транспортных средств (например, автомобили и велосипеды).
//    Вместо того чтобы код зависел от конкретных классов (например, Car и Bicycle), мы будем использовать фабричный метод для создания объектов.
//    Это позволит расширять систему, добавляя новые типы транспортных средств, не меняя существующий код.
    static void main(String[] args) {
        TransportFactory transportFactory;
        String trasnportType = "Car";
        if ("Car".equals(trasnportType)) {
            transportFactory = new CarFactory();
        } else {
            transportFactory = new BicycleFactory();
        }
        transportFactory.moveTransport();
    }
}