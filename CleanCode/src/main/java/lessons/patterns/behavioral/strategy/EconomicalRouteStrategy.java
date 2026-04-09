package lessons.patterns.behavioral.strategy;

public class EconomicalRouteStrategy implements RouteStrategy {
    @Override
    public void buildRoute() {
        System.out.println("Building the most economical route.");
    }
}
