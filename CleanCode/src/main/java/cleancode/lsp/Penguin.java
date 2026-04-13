package cleancode.lsp;

public class Penguin extends Bird {
    Penguin(String name) {
        super(name);
    }

    public void swim() {
        System.out.println("Пингвин плавает");
    }
}
