package lessons.patterns.creational.fabricmethod;

class Ship extends Transport {
    @Override
    void deliver() {
        System.out.println("Deliver by sea in a container.");
    }
}
