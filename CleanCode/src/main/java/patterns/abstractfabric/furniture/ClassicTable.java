package patterns.abstractfabric.furniture;

public class ClassicTable implements Table {
    @Override
    public void use() {
        System.out.println("Using classic table");
    }
}
