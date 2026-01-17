package ObjectOrientedProgramming.Encapsulation;

/*
 * This interface defines reservation-related operations
 * for library items.
 */
interface Reservable {

    // Method to reserve a library item
    void reserveItem();

    // Method to check availability of the item
    boolean checkAvailability();
}

/*
 * This abstract class represents a generic Library Item
 * and demonstrates encapsulation and abstraction.
 */
abstract class LibraryItem {

    // Private fields to enforce encapsulation
    private int itemId;
    private String title;
    private String author;

    // Constructor to initialize library item details
    LibraryItem(int id, String title, String author) {
        this.itemId = id;
        this.title = title;
        this.author = author;
    }

    // Abstract method to define loan duration
    abstract int getLoanDuration();

    // Method to display item details
    void getItemDetails() {
        System.out.println(title + " by " + author);
    }
}

/*
 * This class represents a Book in the library.
 * It extends LibraryItem and provides loan duration logic.
 */
class Book extends LibraryItem {

    // Constructor to initialize book details
    Book(int id, String t, String a) {
        super(id, t, a);
    }

    // Loan duration for a book (in days)
    int getLoanDuration() {
        return 14;
    }
}

/*
 * This class demonstrates the Library Management system
 * using abstraction and polymorphism.
 */
public class LibManage {
    public static void main(String[] args) {

        // Create LibraryItem reference with Book object
        LibraryItem item = new Book(1, "1984", "Orwell");

        // Display library item details
        item.getItemDetails();
    }
}
