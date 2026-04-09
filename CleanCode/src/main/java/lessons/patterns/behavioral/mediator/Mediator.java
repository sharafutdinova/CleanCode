package lessons.patterns.behavioral.mediator;

public interface Mediator {
    void notify(Object sender, String event);
}
