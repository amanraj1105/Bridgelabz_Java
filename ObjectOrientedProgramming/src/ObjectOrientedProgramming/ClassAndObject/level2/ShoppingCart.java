package ObjectOrientedProgramming.ClassAndObject.level2;

import java.util.Scanner;

/*
 * This class represents an item in a shopping cart
 * and provides methods to add items, remove items,
 * and calculate the total cost.
 */
class CartItem {

    // Name of the item
    String itemName;

    // Price per unit of the item
    double price;

    // Quantity of the item in the cart
    int quantity;

    // Constructor to initialize item name and price
    CartItem(String itemName, double price) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = 0;
    }

    // Method to add quantity to the cart
    void addItem(int qty) {
        if (qty > 0) {
            quantity += qty;
        }
    }

    // Method to remove quantity from the cart
    void removeItem(int qty) {
        if (qty > 0 && qty <= quantity) {
            quantity -= qty;
        }
    }

    // Method to calculate total cost of the item
    double totalCost() {
        return price * quantity;
    }

    // Method to display item details and total cost
    void displayTotal() {
        System.out.println("Item: " + itemName);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Cost: " + totalCost());
    }
}

/*
 * This class takes shopping cart details as input,
 * performs add and remove operations on the cart,
 * and displays the final total cost.
 */
public class ShoppingCart {
    public static void main(String[] args) {

        // Create Scanner object to take input from the user
        Scanner sc = new Scanner(System.in);

        // Read item name
        String itemName = sc.nextLine();

        // Read item price
        double price = sc.nextDouble();

        // Read quantity to add
        int addQty = sc.nextInt();

        // Read quantity to remove
        int removeQty = sc.nextInt();

        // Create CartItem object
        CartItem item = new CartItem(itemName, price);

        // Add items to the cart
        item.addItem(addQty);

        // Remove items from the cart
        item.removeItem(removeQty);

        // Display final cart details
        item.displayTotal();

        // Close the Scanner object
        sc.close();
    }
}
