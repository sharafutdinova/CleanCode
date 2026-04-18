package patterns.abstractfabric.gui;

public class MacOSMenu implements Menu{
    @Override
    public void open() {
        System.out.println("MacOS menu is open");
    }
}
