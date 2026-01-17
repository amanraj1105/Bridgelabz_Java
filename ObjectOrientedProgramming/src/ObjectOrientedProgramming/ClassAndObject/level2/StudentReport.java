package ObjectOrientedProgramming.ClassAndObject.level2;

import java.util.Scanner;

/*
 * This class represents a Student and provides
 * functionality to calculate and display the grade
 * based on marks.
 */
class Student {

    // Student name
    String name;

    // Student roll number
    int rollNumber;

    // Student marks
    int marks;

    // Constructor to initialize student details
    Student(String name, int rollNumber, int marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    // Method to calculate grade based on marks
    String calculateGrade() {
        if (marks >= 90) return "A";
        else if (marks >= 80) return "B";
        else if (marks >= 70) return "C";
        else if (marks >= 60) return "D";
        else return "F";
    }

    // Method to display student report
    void displayReport() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + calculateGrade());
    }
}

/*
 * This class takes student details as input,
 * creates a Student object, and displays
 * the student's report.
 */
public class StudentReport {
    public static void main(String[] args) {

        // Create Scanner object to take input from the user
        Scanner sc = new Scanner(System.in);

        // Read student name
        String name = sc.nextLine();

        // Read roll number
        int rollNumber = sc.nextInt();

        // Read marks
        int marks = sc.nextInt();

        // Create Student object
        Student student = new Student(name, rollNumber, marks);

        // Display student report
        student.displayReport();

        // Close the Scanner object
        sc.close();
    }
}
