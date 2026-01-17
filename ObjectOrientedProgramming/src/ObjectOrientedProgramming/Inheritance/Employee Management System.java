package ObjectOrientedProgramming.Inheritance;

/*
 * This class represents a generic Employee
 * with common attributes and behavior.
 */
class Employee {

    // Name of the employee
    String name;

    // Employee ID
    int id;

    // Employee salary
    double salary;

    // Constructor to initialize employee details
    Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    // Method to display employee details
    void displayDetails() {
        System.out.println(name + " " + id + " " + salary);
    }
}

/*
 * This class represents a Manager
 * and extends the Employee class.
 */
class Manager extends Employee {

    // Number of team members managed
    int teamSize;

    // Constructor to initialize manager details
    Manager(String name, int id, double salary, int teamSize) {
        super(name, id, salary);
        this.teamSize = teamSize;
    }

    // Override method to display manager details
    @Override
    void displayDetails() {
        System.out.println(name + " " + id + " " + salary + " " + teamSize);
    }
}

/*
 * This class represents a Developer
 * and extends the Employee class.
 */
class Developer extends Employee {

    // Primary programming language of the developer
    String programmingLanguage;

    // Constructor to initialize developer details
    Developer(String name, int id, double salary, String programmingLanguage) {
        super(name, id, salary);
        this.programmingLanguage = programmingLanguage;
    }

    // Override method to display developer details
    @Override
    void displayDetails() {
        System.out.println(name + " " + id + " " + salary + " " + programmingLanguage);
    }
}

/*
 * This class represents an Intern
 * and extends the Employee class.
 */
class Intern extends Employee {

    // Internship duration in months
    int durationMonths;

    // Constructor to initialize intern details
    Intern(String name, int id, double salary, int durationMonths) {
        super(name, id, salary);
        this.durationMonths = durationMonths;
    }

    // Override method to display intern details
    @Override
    void displayDetails() {
        System.out.println(name + " " + id + " " + salary + " " + durationMonths);
    }
}
