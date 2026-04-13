package cleancode.lsp;

public class Main {
    static void main(String[] args) {
        FlyingBird pigeon = new Pigeon("Голубь");
        pigeon.eat();
        pigeon.fly();
        Penguin penguin = new Penguin("Пингвин");
        penguin.eat();
        penguin.swim();
    }
}
