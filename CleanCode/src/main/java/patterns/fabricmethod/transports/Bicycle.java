package patterns.fabricmethod.transports;

public class Bicycle implements Transport {
    @Override
    public void move() {
        System.out.println("Bicycle is moved on the road");
    }
}
