package patterns.fabricmethod.transports;

public class BicycleFactory extends TransportFactory {
    @Override
    public Transport createTransport() {
        return new Bicycle();
    }
}
