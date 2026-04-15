package patterns.abstractfabric.gui;

public interface GUIfactory {
    Button createButton();

    Menu createMenu();

    Window createWindow();
}
