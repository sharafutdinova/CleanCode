package lessons.patterns.creational.fabricmethod;

public class SeaLogistics extends Logistics {
    @Override
    Transport createTransport() {
        return new Ship();
    }
}
