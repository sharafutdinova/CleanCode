package lessons.patterns.structural.decorator;

public class CoffeeDecorator implements Coffee {
    private Coffee coffee;

    public CoffeeDecorator(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public double cost() {
        return this.coffee.cost();
    }
}
