package ObjectOrientedProgramming.Encapsulation;

import java.util.*;

/*
 * This interface defines tax-related operations
 * for products that are taxable.
 */
interface Taxable {

    // Method to calculate tax on a product
    double calculateTax();

    // Method to return tax description
    String getTaxDetails();
}

/*
 * This abstract class represents a generic Product
 * and demonstrates encapsulation using private fields.
 */
abstract class Product {

    // Private fields to enforce encapsulation
    private int productId;
    private String name;
    private double price;

    // Constructor to initialize product details
    Product(int productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    // Getter method to access price
    public double getPrice() {
        return price;
    }

    // Abstract method to calculate discount
    abstract double calculateDiscount();
}

/*
 * This class represents an Electronics product.
 * It implements the Taxable interface.
 */
class Electronics extends Product implements Taxable {

    // Constructor to initialize electronics product
    Electronics(int id, String name, double price) {
        super(id, name, price);
    }

    // Calculate discount for electronics (10%)
    double calculateDiscount() {
        return getPrice() * 0.1;
    }

    // Calculate tax for electronics (18% GST)
    public double calculateTax() {
        return getPrice() * 0.18;
    }

    // Return tax details
    public String getTaxDetails() {
        return "18% GST";
    }
}

/*
 * This class represents a Clothing product.
 * Clothing products do not have tax calculation here.
 */
class Clothing extends Product {

    // Constructor to initialize clothing product
    Clothing(int id, String name, double price) {
        super(id, name, price);
    }

    // Calculate discount for clothing (20%)
    double calculateDiscount() {
        return getPrice() * 0.2;
    }
}

/*
 * This class simulates a simple E-commerce platform
 * demonstrating abstraction, inheritance, interface,
 * and polymorphism.
 */
public class EcommPlat {
    public static void main(String[] args) {

        // Create a list to store different types of products
        List<Product> products = new ArrayList<>();

        // Add products to the list
        products.add(new Electronics(1, "Laptop", 60000));
        products.add(new Clothing(2, "Jacket", 3000));

        // Calculate and display final price for each product
        for (Product p : products) {

            // Check if product is taxable
            double tax = (p instanceof Taxable)
                    ? ((Taxable) p).calculateTax()
                    : 0;

            // Calculate final price after tax and discount
            double finalPrice =
                    p.getPrice() + tax - p.calculateDiscount();

            // Display final price
            System.out.println(finalPrice);
        }
    }
}
