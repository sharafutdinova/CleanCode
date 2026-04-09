package lessons.patterns.structural.adapter;

public class CelsuisAdapter {
    private FahrenheitThermometer fahrenheitThermometer;

    public CelsuisAdapter(FahrenheitThermometer fahrenheitThermometer) {
        this.fahrenheitThermometer = fahrenheitThermometer;
    }

    public double getCelsuis() {
        double fTemp = fahrenheitThermometer.getFahrenheitTemperature();
        return (fTemp - 32) * 5.0 / 9.0; // Преобразование в Цельсий
    }
}
