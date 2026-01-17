package ObjectOrientedProgramming.ClassAndObject.level2;

import java.util.Scanner;

/*
 * This class represents a Movie Ticket and allows
 * booking a ticket by assigning seat number and price.
 */
class MovieTicket {

    // Name of the movie
    String movieName;

    // Seat number booked
    int seatNumber;

    // Ticket price
    double price;

    // Constructor to initialize movie name
    MovieTicket(String movieName) {
        this.movieName = movieName;
    }

    // Method to book the ticket with seat number and price
    void bookTicket(int seatNumber, double price) {
        this.seatNumber = seatNumber;
        this.price = price;
    }

    // Method to display ticket details
    void displayTicket() {
        System.out.println("Movie Name: " + movieName);
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("Price: " + price);
    }
}

/*
 * This class takes movie ticket details as input,
 * creates a MovieTicket object, and displays
 * the booked ticket information.
 */
public class MovieTicketBooking {
    public static void main(String[] args) {

        // Create Scanner object to take input from the user
        Scanner sc = new Scanner(System.in);

        // Read movie name
        String movieName = sc.nextLine();

        // Read seat number
        int seatNumber = sc.nextInt();

        // Read ticket price
        double price = sc.nextDouble();

        // Create MovieTicket object
        MovieTicket ticket = new MovieTicket(movieName);

        // Book the ticket
        ticket.bookTicket(seatNumber, price);

        // Display ticket details
        ticket.displayTicket();

        // Close the Scanner object
        sc.close();
    }
}
