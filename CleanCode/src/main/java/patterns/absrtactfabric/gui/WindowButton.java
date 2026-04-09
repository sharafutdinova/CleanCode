package patterns.absrtactfabric.gui;

public class WindowButton implements Button{
    @Override
    public void click() {
        System.out.println("Click to Windows button");
    }
}
