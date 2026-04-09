package patterns.absrtactfabric.furniture;

public class ClassicFurnitureFactory implements FurnitureFactory {
    @Override
    public Table createTable() {
        return new ClassicTable();
    }

    @Override
    public Chair createChair() {
        return new ClassicChair();
    }
}
