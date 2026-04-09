package lessons.patterns.creational.singleton;

public class Main {
    static void main(String[] args) {
        // нет возможность вызвать конструктор
        DatabaseConfig config1 = DatabaseConfig.getInstance();
        DatabaseConfig config2 = DatabaseConfig.getInstance();

        config1.config = "DB Config for User A";
        config2.config = "DB Config for User B";

        config1.displayConfig(); // Выводит "DB Config for User B"
        config2.displayConfig(); // Выводит "DB Config for User B"
    }
}
