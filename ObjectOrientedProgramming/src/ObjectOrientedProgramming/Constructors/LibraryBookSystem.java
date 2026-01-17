package ObjectOrientedProgramming.Constructors;

import java.util.Scanner;

/*
 * This class represents a Book in a library system
 * and demonstrates how object state changes when
 * a book is borrowed.
 */
class Book {

    // Title of the book
    String title;

    // Author of the book
    String author;

    // Price of the book
    double price;

    // Availability status of the book
    boolean available;

    // Parameterized constructor to initialize book details
    Book(String title, String author, double price, boolean available) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.available = available;
    }

    // Method to borrow the book
    void borrowBook() {
        if (available) {
            available = false;
            System.out.println("Book borrowed successfully");
        } else {
            System.out.println("Book is not available");
        }
    }

    // Method to display book details
    void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
        System.out.println("Available: " + available);
    }
}

/*
 * This class simulates a library book system
 * by creating a Book object, borrowing it,
 * and displaying its details.
 */
public class LibraryBookSystem {
    public static void main(String[] args) {

        // Create Scanner object to take input from the user
        Scanner sc = new Scanner(System.in);

        // Read book title
        String title = sc.nextLine();

        // Read book author
        String author = sc.nextLine();

        // Read book price
        double price = sc.nextDouble();

        // Create Book object with availability set to true
        Book book = new Book(title, author, price, true);

        // Display initial book details
        book.displayDetails();

        // Borrow the book
        book.borrowBook();

        // Display book details after borrowing
        book.displayDetails();

        // Close the Scanner object
        sc.close();
    }
}
