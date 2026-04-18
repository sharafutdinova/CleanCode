package patterns.abstractfabric.gui;

public class MacOSWindow implements Window{
    @Override
    public void show() {
        System.out.println("MacOS window is shown");
    }
}
