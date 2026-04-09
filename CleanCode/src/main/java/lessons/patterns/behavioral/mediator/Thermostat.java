package lessons.patterns.behavioral.mediator;

class Thermostat {
    private Mediator mediator;

    public void setTemperature(int temperature) {
        System.out.println("Temperature set to " + temperature + "C");
    }
}
