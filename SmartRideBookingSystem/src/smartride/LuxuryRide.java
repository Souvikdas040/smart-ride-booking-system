package smartride;

public class LuxuryRide extends Ride {

    public LuxuryRide(String customerName, String pickupLocation, double distance) {
        super(customerName, pickupLocation, distance);
    }

    @Override
    public double calculateFare() {

        double fare = (getDistance() * 20) + 200;

        if (fare >= 800) {
            fare -= 150;
        }

        return fare;
    }

    @Override
    public String getRideType() {
        return "Luxury Ride";
    }
}