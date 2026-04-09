package patterns.fabricmethod.transports;

public abstract class TransportFactory {
    public abstract Transport createTransport();

    public void moveTransport() {
        Transport transport = createTransport();
        transport.move();
    }

}
