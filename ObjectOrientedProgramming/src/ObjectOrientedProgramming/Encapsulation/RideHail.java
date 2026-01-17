package ObjectOrientedProgramming.Encapsulation;

/*
 * This interface defines GPS-related operations
 * for tracking and updating vehicle location.
 */
interface GPS {

    // Method to get the current location
    String getCurrentLocation();

    // Method to update the vehicle location
    void updateLocation(String location);
}

/*
 * This abstract class represents a generic Vehicle
 * and demonstrates encapsulation and abstraction.
 */
abstract class Vehicle {

    // Private variable to enforce encapsulation
    private String vehicleId;

    // Protected variable accessible by subclasses
    protected double ratePerKm;

    // Constructor to initialize vehicle details
    Vehicle(String id, double rate) {
        vehicleId = id;
        ratePerKm = rate;
    }

    // Abstract method to calculate fare based on distance
    abstract double calculateFare(double distance);

    // Method to display vehicle details
    void getVehicleDetails() {
        System.out.println("Vehicle ID: " + vehicleId);
    }
}

/*
 * This class represents an Auto vehicle
 * used in a ride-hailing system.
 * It implements GPS functionality.
 */
class Auto extends Vehicle implements GPS {

    // Current location of the auto
    private String location = "Unknown";

    // Constructor to initialize auto details
    Auto(String id, double rate) {
        super(id, rate);
    }

    // Calculate fare for auto based on distance
    double calculateFare(double distance) {
        return ratePerKm * distance;
    }

    // Return current location
    public String getCurrentLocation() {
        return location;
    }

    // Update current location
    public void updateLocation(String location) {
        this.location = location;
    }
}

/*
 * This class demonstrates a simple Ride Hailing system
 * using abstraction, interface, and polymorphism.
 */
public class RideHail {
    public static void main(String[] args) {

        // Create Vehicle reference with Auto object
        Auto v = new Auto("AUTO1", 15);

        // Update and display GPS location
        v.updateLocation("MG Road");
        System.out.println("Location: " + v.getCurrentLocation());

        // Calculate and display fare
        System.out.println("Fare: " + v.calculateFare(10));
    }
}
