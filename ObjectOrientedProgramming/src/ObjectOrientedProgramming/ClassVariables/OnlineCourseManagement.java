package ObjectOrientedProgramming.ClassVariables;

import java.util.Scanner;

/*
 * This class represents a Course and demonstrates
 * the use of a static (class) variable shared
 * among all Course objects.
 */
class Course {

    // Instance variable: name of the course
    String courseName;

    // Instance variable: duration of the course
    int duration;

    // Instance variable: course fee
    double fee;

    // Static variable shared by all Course objects
    static String instituteName = "Default Institute";

    // Constructor to initialize course details
    Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    // Method to display course and institute details
    void displayCourseDetails() {
        System.out.println("Institute Name: " + instituteName);
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration);
        System.out.println("Fee: " + fee);
    }

    // Static method to update institute name
    static void updateInstituteName(String name) {
        instituteName = name;
    }
}

/*
 * This class manages online courses by taking
 * input, updating the institute name, and
 * displaying details of multiple courses.
 */
public class OnlineCourseManagement {
    public static void main(String[] args) {

        // Create Scanner object to take input from the user
        Scanner sc = new Scanner(System.in);

        // Read and update institute name (static variable)
        String institute = sc.nextLine();
        Course.updateInstituteName(institute);

        // Read details for first course
        String course1 = sc.nextLine();
        int duration1 = sc.nextInt();
        double fee1 = sc.nextDouble();
        sc.nextLine(); // Consume leftover newline

        // Read details for second course
        String course2 = sc.nextLine();
        int duration2 = sc.nextInt();
        double fee2 = sc.nextDouble();

        // Create Course objects
        Course c1 = new Course(course1, duration1, fee1);
        Course c2 = new Course(course2, duration2, fee2);

        // Display course details
        c1.displayCourseDetails();
        c2.displayCourseDetails();

        // Close the Scanner object
        sc.close();
    }
}
