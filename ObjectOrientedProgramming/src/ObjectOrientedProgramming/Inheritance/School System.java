package ObjectOrientedProgramming.Inheritance;

/*
 * This class represents a generic Person
 * with common personal details.
 */
class Person {

    // Name of the person
    String name;

    // Age of the person
    int age;

    // Constructor to initialize person details
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

/*
 * This class represents a Teacher
 * and extends the Person class.
 */
class Teacher extends Person {

    // Subject taught by the teacher
    String subject;

    // Constructor to initialize teacher details
    Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    // Method to display role
    void displayRole() {
        System.out.println("Teacher");
    }
}

/*
 * This class represents a Student
 * and extends the Person class.
 */
class Student extends Person {

    // Grade of the student
    String grade;

    // Constructor to initialize student details
    Student(String name, int age, String grade) {
        super(name, age);
        this.grade = grade;
    }

    // Method to display role
    void displayRole() {
        System.out.println("Student");
    }
}

/*
 * This class represents a Staff member
 * and extends the Person class.
 */
class Staff extends Person {

    // Department where the staff works
    String department;

    // Constructor to initialize staff details
    Staff(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }

    // Method to display role
    void displayRole() {
        System.out.println("Staff");
    }
}
