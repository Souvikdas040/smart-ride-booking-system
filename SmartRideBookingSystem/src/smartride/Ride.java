package smartride;

public abstract class Ride {

    private static int counter = 1000;

    private String rideId;
    private String customerName;
    private String pickupLocation;
    private double distance;

    public Ride(String customerName, String pickupLocation, double distance) {
        this.customerName = customerName;
        this.pickupLocation = pickupLocation;
        this.distance = distance;
        this.rideId = generateRideId();
    }

    protected String generateRideId() {
        return "R" + (++counter);
    }

    public String getRideId() {
        return rideId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getPickupLocation() {
        return pickupLocation;
    }

    public double getDistance() {
        return distance;
    }

    public abstract double calculateFare();

    public abstract String getRideType();

    public void displayRideDetails() {
        System.out.println("-------------------------------------");
        System.out.println("Ride ID      : " + rideId);
        System.out.println("Customer     : " + customerName);
        System.out.println("Ride Type    : " + getRideType());
        System.out.println("Pickup       : " + pickupLocation);
        System.out.println("Distance     : " + distance + " km");
        System.out.println("Fare         : ₹" + calculateFare());
        System.out.println("-------------------------------------");
    }
}