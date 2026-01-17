package ObjectOrientedProgramming.ClassAndObject.level1;

import java.util.Scanner;

/*
 * This class represents a Mobile Phone with
 * brand, model, and price details.
 */
class MobilePhone {

    // Brand of the mobile phone
    String brand;

    // Model name of the mobile phone
    String model;

    // Price of the mobile phone
    double price;

    // Constructor to initialize mobile phone details
    MobilePhone(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    // Method to display mobile phone details
    void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
    }
}

/*
 * This class takes mobile phone details as input,
 * creates a MobilePhone object, and displays
 * the phone information.
 */
public class MobilePhoneDetails {
    public static void main(String[] args) {

        // Create Scanner object to take input from the user
        Scanner sc = new Scanner(System.in);

        // Read mobile phone brand
        String brand = sc.nextLine();

        // Read mobile phone model
        String model = sc.nextLine();

        // Read mobile phone price
        double price = sc.nextDouble();

        // Create MobilePhone object
        MobilePhone phone = new MobilePhone(brand, model, price);

        // Display mobile phone details
        phone.displayDetails();

        // Close the Scanner object
        sc.close();
    }
}
