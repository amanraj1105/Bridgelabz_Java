package ObjectOrientedProgramming.Constructors;

import java.util.Scanner;

/*
 * This class represents a Circle and demonstrates
 * constructor chaining using the this() keyword.
 */
class Circle {

    // Radius of the circle
    double radius;

    // Default constructor
    // Calls the parameterized constructor with default radius
    Circle() {
        this(1.0); // Constructor chaining
    }

    // Parameterized constructor
    // Initializes the radius with the given value
    Circle(double radius) {
        this.radius = radius;
    }

    // Method to display circle details
    void display() {
        System.out.println("Radius: " + radius);
    }
}

/*
 * This class demonstrates constructor chaining
 * by creating Circle objects using different constructors.
 */
public class CircleConstructorChaining {
    public static void main(String[] args) {

        // Create Scanner object to take input from the user
        Scanner sc = new Scanner(System.in);

        // Create Circle object using default constructor
        Circle c1 = new Circle();
        c1.display();

        // Read radius from the user
        double r = sc.nextDouble();

        // Create Circle object using parameterized constructor
        Circle c2 = new Circle(r);
        c2.display();

        // Close the Scanner object
        sc.close();
    }
}
