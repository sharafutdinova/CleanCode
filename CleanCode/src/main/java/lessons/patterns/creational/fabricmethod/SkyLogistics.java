package lessons.patterns.creational.fabricmethod;

public class SkyLogistics extends Logistics {
    @Override
    Transport createTransport() {
        return new Plane();
    }
}
