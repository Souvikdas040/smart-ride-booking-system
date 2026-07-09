package smartride;

import java.util.ArrayList;

public class RideManager {

    private ArrayList<Ride> rides = new ArrayList<>();

    public void addRide(Ride ride) {

        rides.add(ride);

        System.out.println("\nRide booked successfully!");
        System.out.println("Ride ID : " + ride.getRideId());
        System.out.println("Final Fare : ₹" + ride.calculateFare());
    }

    public void displayAllRides() {

        if (rides.isEmpty()) {
            System.out.println("\nNo rides booked.");
            return;
        }

        for (Ride ride : rides) {
            ride.displayRideDetails();
        }
    }

    public void searchRide(String rideId) {

        for (Ride ride : rides) {

            if (ride.getRideId().equalsIgnoreCase(rideId)) {

                System.out.println("\nRide Found");
                ride.displayRideDetails();
                return;
            }
        }

        System.out.println("\nRide not found.");
    }

    public void showTotalRevenue() {

        double revenue = 0;

        for (Ride ride : rides) {
            revenue += ride.calculateFare();
        }

        System.out.println("\nTotal Bookings : " + rides.size());
        System.out.println("Total Revenue : ₹" + revenue);
    }
}