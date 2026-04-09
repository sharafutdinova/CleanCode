package patterns.absrtactfabric.gui;

public class MacOSFactory implements GUIfactory {
    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Menu createMenu() {
        return new MacOSMenu();
    }

    @Override
    public Window createWindow() {
        return new MacOSWindow();
    }
}
