package patterns.absrtactfabric.gui;

public interface GUIfactory {
    Button createButton();

    Menu createMenu();

    Window createWindow();
}
