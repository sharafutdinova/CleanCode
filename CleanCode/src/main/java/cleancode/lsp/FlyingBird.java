package cleancode.lsp;

public abstract class FlyingBird extends Bird {
    FlyingBird(String name) {
        super(name);
    }

    public void fly() {
        System.out.println(name + " летит");
    }
}
