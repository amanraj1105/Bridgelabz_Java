package ObjectOrientedProgramming.Constructors;

import java.util.Scanner;

/*
 * This class represents a Person and demonstrates
 * the use of a copy constructor to create a duplicate object.
 */
class Person {

    // Name of the person
    String name;

    // Age of the person
    int age;

    // Parameterized constructor
    // Initializes person details with given values
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Copy constructor
    // Creates a new Person object by copying another object
    Person(Person p) {
        this.name = p.name;
        this.age = p.age;
    }

    // Method to display person details
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

/*
 * This class demonstrates the use of
 * the Person copy constructor.
 */
public class PersonCopyConstructor {
    public static void main(String[] args) {

        // Create Scanner object to take input from the user
        Scanner sc = new Scanner(System.in);

        // Read person name
        String name = sc.nextLine();

        // Read person age
        int age = sc.nextInt();

        // Create original Person object
        Person original = new Person(name, age);

        // Create copy of the original object
        Person copy = new Person(original);

        // Display details of both objects
        original.display();
        copy.display();

        // Close the Scanner object
        sc.close();
    }
}
