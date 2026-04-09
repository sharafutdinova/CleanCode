package lessons.patterns.creational.abstractfabric;

class MacOSButton implements Button {
    public void paint() {
        System.out.println("Render a MacOS button.");
    }
}
