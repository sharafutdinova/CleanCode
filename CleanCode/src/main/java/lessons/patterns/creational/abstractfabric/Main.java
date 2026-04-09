package lessons.patterns.creational.abstractfabric;

public class Main {
    public static void main(String[] args) {
        GUIFactory guiFactory;

        String osType = "MacOs";

        if ("Windows".equals(osType)) {
            guiFactory = new WindowsFactory();
        } else {
            guiFactory = new MacOsFactory();
        }

        guiFactory.createButton().paint();
        guiFactory.createCheckbox().paint();
    }
}
