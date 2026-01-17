package ObjectOrientedProgramming.Encapsulation;

/*
 * This interface defines medical record operations
 * for storing and viewing patient records.
 */
interface MedicalRecord {

    // Method to add a medical record
    void addRecord(String record);

    // Method to view medical records
    String viewRecords();
}

/*
 * This abstract class represents a Patient
 * and demonstrates encapsulation and abstraction.
 */
abstract class Patient {

    // Private fields to enforce encapsulation
    private int patientId;
    private String name;
    private int age;

    // Constructor to initialize patient details
    Patient(int id, String n, int a) {
        patientId = id;
        name = n;
        age = a;
    }

    // Abstract method to calculate patient bill
    abstract double calculateBill();

    // Method to display patient details
    void getPatientDetails() {
        System.out.println(name);
    }
}

/*
 * This class represents an In-Patient
 * and provides its own billing logic.
 */
class InPatient extends Patient {

    // Constructor to initialize in-patient details
    InPatient(int id, String n, int a) {
        super(id, n, a);
    }

    // Implementation of abstract billing method
    double calculateBill() {
        return 5000;
    }
}

/*
 * This class demonstrates the Hospital system
 * using abstraction and polymorphism.
 */
public class HospitalDemo {
    public static void main(String[] args) {

        // Create Patient reference with InPatient object
        Patient p = new InPatient(1, "Aayush", 21);

        // Calculate and display patient bill
        System.out.println(p.calculateBill());
    }
}
