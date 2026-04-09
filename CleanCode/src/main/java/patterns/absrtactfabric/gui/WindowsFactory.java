package patterns.absrtactfabric.gui;

public class WindowsFactory implements GUIfactory {
    @Override
    public Button createButton() {
        return new WindowButton();
    }

    @Override
    public Menu createMenu() {
        return new WindowsMenu();
    }

    @Override
    public Window createWindow() {
        return new WindowsWindow();
    }
}
