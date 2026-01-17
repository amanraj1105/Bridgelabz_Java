package ObjectOrientedProgramming.ClassAndObject.level1;

import java.util.Scanner;

/*
 * This class represents an Employee with basic details
 * such as name, ID, and salary.
 */
class Employee {

    // Employee name
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
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: " + salary);
    }
}

/*
 * This class takes employee details as input,
 * creates an Employee object, and displays
 * the employee information.
 */
public class EmployeeDetails {
    public static void main(String[] args) {

        // Create Scanner object to take input from the user
        Scanner sc = new Scanner(System.in);

        // Read employee name
        String name = sc.nextLine();

        // Read employee ID
        int id = sc.nextInt();

        // Read employee salary
        double salary = sc.nextDouble();

        // Create Employee object with provided details
        Employee emp = new Employee(name, id, salary);

        // Display employee details
        emp.displayDetails();

        // Close the Scanner object
        sc.close();
    }
}
