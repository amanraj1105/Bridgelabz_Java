package ObjectOrientedProgramming.Constructors;

import java.util.Scanner;

/*
 * This class represents a Hotel Booking and demonstrates
 * default constructor, parameterized constructor,
 * and copy constructor.
 */
class HotelBooking {

    // Name of the guest
    String guestName;

    // Type of room booked
    String roomType;

    // Number of nights for the stay
    int nights;

    // Default constructor
    // Initializes booking with default values
    HotelBooking() {
        guestName = "Guest";
        roomType = "Standard";
        nights = 1;
    }

    // Parameterized constructor
    // Initializes booking with user-provided values
    HotelBooking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }

    // Copy constructor
    // Creates a new object by copying another HotelBooking object
    HotelBooking(HotelBooking hb) {
        this.guestName = hb.guestName;
        this.roomType = hb.roomType;
        this.nights = hb.nights;
    }

    // Method to display booking details
    void display() {
        System.out.println("Guest Name: " + guestName);
        System.out.println("Room Type: " + roomType);
        System.out.println("Nights: " + nights);
    }
}

/*
 * This class demonstrates hotel booking creation
 * using default, parameterized, and copy constructors.
 */
public class HotelBookingDemo {
    public static void main(String[] args) {

        // Create Scanner object to take input from the user
        Scanner sc = new Scanner(System.in);

        // Create booking using default constructor
        HotelBooking b1 = new HotelBooking();
        b1.display();

        // Read booking details from the user
        String name = sc.nextLine();
        String room = sc.nextLine();
        int nights = sc.nextInt();

        // Create booking using parameterized constructor
        HotelBooking b2 = new HotelBooking(name, room, nights);
        b2.display();

        // Create booking using copy constructor
        HotelBooking b3 = new HotelBooking(b2);
        b3.display();

        // Close the Scanner object
        sc.close();
    }
}
