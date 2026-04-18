package patterns.abstractfabric.gui;

public class MacOSButton implements Button{
    @Override
    public void click() {
        System.out.println("Click to MacOS button");
    }
}
