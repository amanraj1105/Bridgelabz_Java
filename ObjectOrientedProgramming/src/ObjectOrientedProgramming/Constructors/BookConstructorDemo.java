package ObjectOrientedProgramming.Constructors;

import java.util.Scanner;

/*
 * This class represents a Book and demonstrates
 * the use of default and parameterized constructors.
 */
class Book {

    // Book title
    String title;

    // Book author
    String author;

    // Book price
    double price;

    // Default constructor
    // Initializes book details with default values
    Book() {
        title = "Not Assigned";
        author = "Not Assigned";
        price = 0.0;
    }

    // Parameterized constructor
    // Initializes book details with given values
    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Method to display book details
    void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }
}

/*
 * This class demonstrates the use of
 * default and parameterized constructors
 * of the Book class.
 */
public class BookConstructorDemo {
    public static void main(String[] args) {

        // Create Scanner object to take input from the user
        Scanner sc = new Scanner(System.in);

        // Create Book object using default constructor
        Book b1 = new Book();

        // Display details of first book
        b1.display();

        // Read book details from the user
        String title = sc.nextLine();
        String author = sc.nextLine();
        double price = sc.nextDouble();

        // Create Book object using parameterized constructor
        Book b2 = new Book(title, author, price);

        // Display details of second book
        b2.display();

        // Close the Scanner object
        sc.close();
    }
}
