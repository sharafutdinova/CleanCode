package patterns.absrtactfabric.furniture;

public class ModernTable implements Table {
    @Override
    public void use() {
        System.out.println("Using modern table");
    }
}
