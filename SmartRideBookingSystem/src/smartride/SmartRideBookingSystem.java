package smartride;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SmartRideBookingSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        RideManager manager = new RideManager();

        while (true) {

            System.out.println("\n========= SMART RIDE BOOKING =========");
            System.out.println("1. Book Mini Ride");
            System.out.println("2. Book Luxury Ride");
            System.out.println("3. View All Rides");
            System.out.println("4. Search Ride");
            System.out.println("5. Total Revenue");
            System.out.println("6. Exit");

            System.out.print("Enter choice : ");

            int choice;

            try {

                choice = sc.nextInt();
                sc.nextLine();

            } catch (InputMismatchException e) {

                System.out.println("Invalid choice.");
                sc.nextLine();
                continue;
            }

            switch (choice) {

            case 1:
            case 2:

                try {

                    System.out.print("Customer Name : ");
                    String name = sc.nextLine();

                    System.out.print("Pickup Location : ");
                    String pickup = sc.nextLine();

                    System.out.print("Distance (km): ");
                    double distance = sc.nextDouble();
                    sc.nextLine();

                    if (distance <= 0) {
                        System.out.println("Distance must be greater than zero.");
                        break;
                    }

                    Ride ride;

                    if (choice == 1) {
                        ride = new MiniRide(name, pickup, distance);
                    } else {
                        ride = new LuxuryRide(name, pickup, distance);
                    }

                    manager.addRide(ride);

                } catch (InputMismatchException e) {

                    System.out.println("Invalid distance.");
                    sc.nextLine();
                }

                break;

            case 3:

                manager.displayAllRides();
                break;

            case 4:

                System.out.print("Enter Ride ID : ");
                String id = sc.nextLine();

                manager.searchRide(id);

                break;

            case 5:

                manager.showTotalRevenue();
                break;

            case 6:

                System.out.println("Thank you for using Smart Ride Booking System.");
                sc.close();
                System.exit(0);

            default:

                System.out.println("Invalid Choice.");
            }

        }

    }

}