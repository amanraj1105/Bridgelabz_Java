package ObjectOrientedProgramming.Constructors;

import java.util.Scanner;

/*
 * This class represents a Car Rental and demonstrates
 * the use of default and parameterized constructors
 * to calculate rental cost.
 */
class CarRental {

    // Name of the customer
    String customerName;

    // Model of the car
    String carModel;

    // Number of rental days
    int rentalDays;

    // Cost per day for renting the car
    double costPerDay;

    // Default constructor
    // Initializes rental with default values
    CarRental() {
        customerName = "Customer";
        carModel = "Standard";
        rentalDays = 1;
        costPerDay = 1000;
    }

    // Parameterized constructor
    // Initializes rental with provided values
    CarRental(String customerName, String carModel, int rentalDays, double costPerDay) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
        this.costPerDay = costPerDay;
    }

    // Method to calculate total rental cost
    double calculateTotalCost() {
        return rentalDays * costPerDay;
    }

    // Method to display rental details
    void displayDetails() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Car Model: " + carModel);
        System.out.println("Rental Days: " + rentalDays);
        System.out.println("Total Cost: " + calculateTotalCost());
    }
}

/*
 * This class demonstrates the CarRental system
 * by creating objects using different constructors.
 */
public class CarRentalSystem {
    public static void main(String[] args) {

        // Create Scanner object to take input from the user
        Scanner sc = new Scanner(System.in);

        // Create CarRental object using default constructor
        CarRental r1 = new CarRental();

        // Display details of default rental
        r1.displayDetails();

        // Read rental details from the user
        String name = sc.nextLine();
        String model = sc.nextLine();
        int days = sc.nextInt();
        double rate = sc.nextDouble();

        // Create CarRental object using parameterized constructor
        CarRental r2 = new CarRental(name, model, days, rate);

        // Display details of user-defined rental
        r2.displayDetails();

        // Close the Scanner object
        sc.close();
    }
}
