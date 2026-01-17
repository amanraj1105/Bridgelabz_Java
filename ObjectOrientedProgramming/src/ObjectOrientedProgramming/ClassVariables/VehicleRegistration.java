package ObjectOrientedProgramming.ClassVariables;

import java.util.Scanner;

/*
 * This class represents a Vehicle and demonstrates
 * the use of a static variable for registration fee
 * shared by all vehicle objects.
 */
class Vehicle {

    // Name of the vehicle owner
    String ownerName;

    // Type of the vehicle (e.g., Car, Bike)
    String vehicleType;

    // Static variable for registration fee (common for all vehicles)
    static double registrationFee = 5000.0;

    // Constructor to initialize vehicle details
    Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    // Method to display vehicle details
    void displayVehicleDetails() {
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Fee: " + registrationFee);
    }

    // Static method to update registration fee
    static void updateRegistrationFee(double fee) {
        registrationFee = fee;
    }
}

/*
 * This class manages vehicle registration by
 * updating the registration fee and displaying
 * details of registered vehicles.
 */
public class VehicleRegistration {
    public static void main(String[] args) {

        // Create Scanner object to take input from the user
        Scanner sc = new Scanner(System.in);

        // Read new registration fee
        double newFee = sc.nextDouble();
        sc.nextLine(); // Consume leftover newline

        // Update static registration fee
        Vehicle.updateRegistrationFee(newFee);

        // Read details for first vehicle
        String owner1 = sc.nextLine();
        String type1 = sc.nextLine();

        // Read details for second vehicle
        String owner2 = sc.nextLine();
        String type2 = sc.nextLine();

        // Create Vehicle objects
        Vehicle v1 = new Vehicle(owner1, type1);
        Vehicle v2 = new Vehicle(owner2, type2);

        // Display vehicle details
        v1.displayVehicleDetails();
        v2.displayVehicleDetails();

        // Close the Scanner object
        sc.close();
    }
}
