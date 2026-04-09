package lessons.patterns.creational.fabricmethod;

class Truck extends Transport {
    @Override
    void deliver() {
        System.out.println("Deliver by land in a box.");
    }
}
