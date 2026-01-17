package ObjectOrientedProgramming.ClassVariables;

import java.util.Scanner;

/*
 * This class represents a Product and demonstrates
 * the use of a static variable to count the total
 * number of products created.
 */
class Product {

    // Instance variable: product name
    String productName;

    // Instance variable: product price
    double price;

    // Static variable to track total products
    static int totalProducts = 0;

    // Constructor to initialize product details
    Product(String productName, double price) {
        this.productName = productName;
        this.price = price;

        // Increment total products count whenever a product is created
        totalProducts++;
    }

    // Method to display product details
    void displayProductDetails() {
        System.out.println("Product Name: " + productName);
        System.out.println("Price: " + price);
    }

    // Static method to display total number of products
    static void displayTotalProducts() {
        System.out.println("Total Products: " + totalProducts);
    }
}

/*
 * This class manages the product inventory by
 * creating product objects and displaying
 * product details and total product count.
 */
public class ProductInventory {
    public static void main(String[] args) {

        // Create Scanner object to take input from the user
        Scanner sc = new Scanner(System.in);

        // Read first product name
        String name1 = sc.nextLine();

        // Read first product price
        double price1 = sc.nextDouble();
        sc.nextLine(); // Consume leftover newline

        // Read second product name
        String name2 = sc.nextLine();

        // Read second product price
        double price2 = sc.nextDouble();

        // Create Product objects
        Product p1 = new Product(name1, price1);
        Product p2 = new Product(name2, price2);

        // Display product details
        p1.displayProductDetails();
        p2.displayProductDetails();

        // Display total number of products created
        Product.displayTotalProducts();

        // Close the Scanner object
        sc.close();
    }
}
