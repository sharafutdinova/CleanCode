package lessons.patterns.behavioral.strategy;

public class LeastTurnsRouteStrategy implements RouteStrategy {
    @Override
    public void buildRoute() {
        System.out.println("Building the route with the least turns.");
    }
}
