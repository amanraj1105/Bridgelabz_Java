package ObjectOrientedProgramming.Encapsulation;

import java.util.*;

/*
 * This interface defines insurance-related operations
 * for vehicles that can be insured.
 */
interface Insurable {

    // Method to calculate insurance amount
    double calculateInsurance();

    // Method to return insurance details
    String getInsuranceDetails();
}

/*
 * This abstract class represents a generic Vehicle
 * and demonstrates encapsulation and abstraction.
 */
abstract class Vehicle {

    // Private variable to enforce encapsulation
    private String vehicleNumber;

    // Private rental rate per day
    private double rentalRate;

    // Constructor to initialize vehicle details
    Vehicle(String vehicleNumber, double rentalRate) {
        this.vehicleNumber = vehicleNumber;
        this.rentalRate = rentalRate;
    }

    // Getter method to access rental rate
    public double getRentalRate() {
        return rentalRate;
    }

    // Abstract method to calculate rental cost
    abstract double calculateRentalCost(int days);
}

/*
 * This class represents a Car that can be rented
 * and insured.
 */
class Car extends Vehicle implements Insurable {

    // Constructor to initialize car details
    Car(String no, double rate) {
        super(no, rate);
    }

    // Calculate rental cost based on number of days
    double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    // Calculate insurance amount for the car
    public double calculateInsurance() {
        return 500;
    }

    // Return insurance details
    public String getInsuranceDetails() {
        return "Car Insurance";
    }
}

/*
 * This class demonstrates a Vehicle Rental system
 * using abstraction, interface, and polymorphism.
 */
public class VehRent {
    public static void main(String[] args) {

        // Create a list of vehicles
        List<Vehicle> vehicles = List.of(
                new Car("KA01", 2000)
        );

        // Calculate and display rental cost for each vehicle
        for (Vehicle v : vehicles) {
            System.out.println(v.calculateRentalCost(3));
        }
    }
}
