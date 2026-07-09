package smartride;

public class MiniRide extends Ride {

    public MiniRide(String customerName, String pickupLocation, double distance) {
        super(customerName, pickupLocation, distance);
    }

    @Override
    public double calculateFare() {

        double fare = getDistance() * 12;

        if (getDistance() > 20) {
            fare -= 80;
        }

        return fare;
    }

    @Override
    public String getRideType() {
        return "Mini Ride";
    }
}