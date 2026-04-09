package patterns.fabricmethod.transports;

public class Car implements Transport {
    @Override
    public void move() {
        System.out.println("Car is moved on the road");
    }
}
