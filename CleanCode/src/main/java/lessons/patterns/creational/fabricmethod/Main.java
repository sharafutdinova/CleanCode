package lessons.patterns.creational.fabricmethod;

public class Main {
    static void main(String[] args) {
        Logistics logistics;

        String transportType = "ship"; // Тип может быть основан на входных данных или конфигурации

        if ("truck".equals(transportType)) {
            logistics = new LandLogistics(); // делегирован фабричному методу createTransport
        } else if ("ship".equals("transportType")) {
            logistics = new SeaLogistics(); // делегирован фабричному методу createTransport
        } else {
            logistics = new SkyLogistics(); // делегирован фабричному методу createTransport
        }
        logistics.planDeleivery();
    }
}
