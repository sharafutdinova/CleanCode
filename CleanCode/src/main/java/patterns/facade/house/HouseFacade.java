package patterns.facade.house;

public class HouseFacade {
    private Light light;
    private AirConditioner airConditioner;
    private SecuritySystem securitySystem;

    public HouseFacade(Light light, AirConditioner airConditioner, SecuritySystem securitySystem) {
        this.light = light;
        this.airConditioner = airConditioner;
        this.securitySystem = securitySystem;
    }

    public void turnOnAll() {
        light.turnOn();
        airConditioner.turnOn();
        securitySystem.turnOn();
    }

    public void turnOffAll() {
        light.turnOff();
        airConditioner.turnOff();
        securitySystem.turnOff();
    }
}
