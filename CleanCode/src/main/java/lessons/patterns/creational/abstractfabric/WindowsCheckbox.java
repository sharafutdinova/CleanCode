package lessons.patterns.creational.abstractfabric;

class WindowsCheckbox implements Checkbox {
    public void paint() {
        System.out.println("Render a Windows checkbox.");
    }
}