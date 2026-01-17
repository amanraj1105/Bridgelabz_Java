package ObjectOrientedProgramming.ClassAndObject.level1;

import java.util.Scanner;

/*
 * This class represents a Circle and provides methods
 * to calculate its area and circumference.
 */
class Circle {

    // Radius of the circle
    double radius;

    // Constructor to initialize the radius
    Circle(double radius) {
        this.radius = radius;
    }

    // Method to calculate and return the area of the circle
    double area() {
        return Math.PI * radius * radius;
    }

    // Method to calculate and return the circumference of the circle
    double circumference() {
        return 2 * Math.PI * radius;
    }

    // Method to display area and circumference
    void display() {
        System.out.println("Area: " + area());
        System.out.println("Circumference: " + circumference());
    }
}

/*
 * This class takes user input for the radius,
 * creates a Circle object, and displays its
 * area and circumference.
 */
public class CircleArea {
    public static void main(String[] args) {

        // Create Scanner object to take input from the user
        Scanner sc = new Scanner(System.in);

        // Read radius from the user
        double radius = sc.nextDouble();

        // Create Circle object with given radius
        Circle c = new Circle(radius);

        // Display area and circumference
        c.display();

        // Close the Scanner object
        sc.close();
    }
}
