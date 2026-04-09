package lessons.patterns.creational.abstractfabric;

// абстрактная фабрика
public interface GUIFactory {
    Button createButton(); // фабричный метод

    Checkbox createCheckbox(); // фабричный метод
}
