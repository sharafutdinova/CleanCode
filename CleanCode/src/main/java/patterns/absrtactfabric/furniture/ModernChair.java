package patterns.absrtactfabric.furniture;

public class ModernChair implements Chair {
    @Override
    public void sitOn() {
        System.out.println("Sit on to modern chair");
    }
}
