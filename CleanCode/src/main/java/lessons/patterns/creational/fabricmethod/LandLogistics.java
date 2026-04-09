package lessons.patterns.creational.fabricmethod;

public class LandLogistics extends Logistics {
    @Override
    Transport createTransport() {
        return new Truck();
    }
}
