package ObjectOrientedProgramming.Encapsulation;

/*
 * This interface defines discount-related operations
 * that food items can implement.
 */
interface Discountable {

    // Method to apply discount on the item
    double applyDiscount();

    // Method to return discount details
    String getDiscountDetails();
}

/*
 * This abstract class represents a generic Food Item
 * and demonstrates encapsulation and abstraction.
 */
abstract class FoodItem {

    // Private variable to enforce encapsulation
    private String itemName;

    // Protected variables accessible by subclasses
    protected double price;
    protected int quantity;

    // Constructor to initialize food item details
    FoodItem(String name, double price, int qty) {
        itemName = name;
        this.price = price;
        quantity = qty;
    }

    // Abstract method to calculate total price
    abstract double calculateTotalPrice();

    // Method to display item name
    void getItemDetails() {
        System.out.println(itemName);
    }
}

/*
 * This class represents a Non-Vegetarian food item.
 * It extends FoodItem and implements Discountable.
 */
class NonVegItem extends FoodItem implements Discountable {

    // Constructor to initialize non-veg item details
    NonVegItem(String n, double p, int q) {
        super(n, p, q);
    }

    // Calculate total price including extra charges
    double calculateTotalPrice() {
        return price * quantity + 50; // Extra charge for non-veg
    }

    // Apply flat discount
    public double applyDiscount() {
        return 100;
    }

    // Return discount details
    public String getDiscountDetails() {
        return "Flat 100 off";
    }
}

/*
 * This class demonstrates a simple Food Delivery system
 * using abstraction, interface, and polymorphism.
 */
public class FoodDel {
    public static void main(String[] args) {

        // Create FoodItem reference with NonVegItem object
        FoodItem item = new NonVegItem("Chicken", 200, 2);

        // Display total price of the food item
        System.out.println(item.calculateTotalPrice());
    }
}
