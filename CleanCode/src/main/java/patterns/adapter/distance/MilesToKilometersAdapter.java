package patterns.adapter.distance;

public class MilesToKilometersAdapter {
    private Miles miles;
    private final double COEFFICIENT_FROM_MILIES_TO_KM = 1.61;

    public MilesToKilometersAdapter(Miles miles) {
        this.miles = miles;
    }

    public double getDistanceInKm() {
        return miles.getDistanceInMiles() * this.COEFFICIENT_FROM_MILIES_TO_KM;
    }
}
