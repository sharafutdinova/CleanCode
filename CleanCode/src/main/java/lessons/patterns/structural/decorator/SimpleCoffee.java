package lessons.patterns.structural.decorator;

public class SimpleCoffee implements Coffee {
    @Override
    public double cost() {
        return 1.0;
    }
}
