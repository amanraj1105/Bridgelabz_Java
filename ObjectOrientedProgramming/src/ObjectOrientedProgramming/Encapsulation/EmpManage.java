package ObjectOrientedProgramming.Encapsulation;

import java.util.*;

/*
 * This interface defines department-related operations
 * that an employee can implement.
 */
interface Department {

    // Assign department to an employee
    void assignDepartment(String name);

    // Get department details of an employee
    String getDepartmentDetails();
}

/*
 * This abstract class represents a generic Employee
 * and demonstrates encapsulation and abstraction.
 */
abstract class Employee implements Department {

    // Private fields to enforce encapsulation
    private int employeeId;
    private String name;
    private double baseSalary;

    // Department assigned to the employee
    private String department;

    // Constructor to initialize employee details
    Employee(int employeeId, String name, double baseSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    // Getter methods
    public int getEmployeeId() { return employeeId; }
    public String getName() { return name; }
    public double getBaseSalary() { return baseSalary; }

    // Assign department (interface implementation)
    public void assignDepartment(String name) {
        this.department = name;
    }

    // Return department details
    public String getDepartmentDetails() {
        return department;
    }

    // Abstract method to calculate salary
    abstract double calculateSalary();

    // Method to display employee details
    void displayDetails() {
        System.out.println(employeeId + " " + name + " " + calculateSalary());
    }
}

/*
 * This class represents a Full-Time Employee.
 */
class FullTimeEmployee extends Employee {

    // Constructor for full-time employee
    FullTimeEmployee(int id, String name, double salary) {
        super(id, name, salary);
    }

    // Salary calculation for full-time employee
    double calculateSalary() {
        return getBaseSalary();
    }
}

/*
 * This class represents a Part-Time Employee.
 */
class PartTimeEmployee extends Employee {

    // Number of hours worked
    private int hours;

    // Constructor for part-time employee
    PartTimeEmployee(int id, String name, double rate, int hours) {
        super(id, name, rate);
        this.hours = hours;
    }

    // Salary calculation for part-time employee
    double calculateSalary() {
        return getBaseSalary() * hours;
    }
}

/*
 * This class demonstrates an Employee Management System
 * using abstraction, inheritance, interface, and polymorphism.
 */
public class EmpManage {
    public static void main(String[] args) {

        // Create a list to store employees
        List<Employee> employees = new ArrayList<>();

        // Add full-time and part-time employees
        employees.add(new FullTimeEmployee(1, "Aayush", 50000));
        employees.add(new PartTimeEmployee(2, "Rahul", 500, 40));

        // Display details of all employees
        for (Employee e : employees) {
            e.displayDetails();
        }
    }
}
