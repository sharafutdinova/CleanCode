package lessons.patterns.structural.decorator;

public class Main {
    public static void main(String[] args) {
        //  1) цель: сделать кофе с молоком
        Coffee coffee = new SimpleCoffee();
        coffee = new MilkDecorator(coffee);
        System.out.println(coffee.cost());

        // 2) цель: сделать кофе с сахаром
        Coffee coffeeWithSugar = new SimpleCoffee();
        coffeeWithSugar = new SugarDecorator(coffeeWithSugar);
        System.out.println(coffeeWithSugar.cost());

        // 3) цель: кофе с молоком и сахаром
        Coffee coffeeWithSugarAndMilk = new SimpleCoffee(); // простой кофе
        coffeeWithSugarAndMilk = new SugarDecorator(coffeeWithSugarAndMilk); // простой кофе + сахар
        coffeeWithSugarAndMilk = new MilkDecorator(coffeeWithSugarAndMilk); // простой кофе + сахар + молоко
        System.out.println(coffeeWithSugarAndMilk.cost());
    }
}
