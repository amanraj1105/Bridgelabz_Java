package ObjectOrientedProgramming.ClassAndObject.level1;

import java.util.Scanner;

/*
 * This class represents an Item in an inventory
 * with details such as item code, name, and price.
 */
class Item {

    // Unique code of the item
    int itemCode;

    // Name of the item
    String itemName;

    // Price of a single item
    double price;

    // Constructor to initialize item details
    Item(int itemCode, String itemName, double price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }

    // Method to display item details
    void displayDetails() {
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.println("Price: " + price);
    }

    // Method to calculate total cost based on quantity
    double totalCost(int quantity) {
        return price * quantity;
    }
}

/*
 * This class takes item details and quantity as input,
 * creates an Item object, and displays the total cost.
 */
public class Inventory {
    public static void main(String[] args) {

        // Create Scanner object to take input from the user
        Scanner sc = new Scanner(System.in);

        // Read item code
        int itemCode = sc.nextInt();

        // Consume leftover newline
        sc.nextLine();

        // Read item name
        String itemName = sc.nextLine();

        // Read item price
        double price = sc.nextDouble();

        // Read quantity
        int quantity = sc.nextInt();

        // Create Item object
        Item item = new Item(itemCode, itemName, price);

        // Display item details
        item.displayDetails();

        // Display total cost
        System.out.println("Total Cost: " + item.totalCost(quantity));

        // Close the Scanner object
        sc.close();
    }
}
