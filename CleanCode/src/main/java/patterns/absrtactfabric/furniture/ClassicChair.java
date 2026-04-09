package patterns.absrtactfabric.furniture;

public class ClassicChair implements Chair {
    @Override
    public void sitOn() {
        System.out.println("Sit on to classic chair");
    }
}
