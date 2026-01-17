package ObjectOrientedProgramming.Encapsulation;

/*
 * This interface defines loan-related operations
 * that any loan-providing account can implement.
 */
interface Loanable {

    // Method to apply for a loan
    void applyForLoan();

    // Method to calculate loan eligibility amount
    double calculateLoanEligibility();
}

/*
 * This abstract class represents a generic Bank Account
 * and demonstrates encapsulation and abstraction.
 */
abstract class BankAccount {

    // Private variables to enforce encapsulation
    private String accountNumber;
    private String holderName;

    // Protected balance accessible to subclasses
    protected double balance;

    // Constructor to initialize bank account details
    BankAccount(String acc, String name, double bal) {
        accountNumber = acc;
        holderName = name;
        balance = bal;
    }

    // Method to deposit money
    void deposit(double amount) {
        balance += amount;
    }

    // Method to withdraw money
    void withdraw(double amount) {
        balance -= amount;
    }

    // Abstract method to calculate interest
    abstract double calculateInterest();
}

/*
 * This class represents a Savings Account
 * and provides its own interest calculation logic.
 */
class SavingsAccount extends BankAccount {

    // Constructor to initialize savings account
    SavingsAccount(String a, String n, double b) {
        super(a, n, b);
    }

    // Implementation of abstract method
    double calculateInterest() {
        return balance * 0.04;
    }
}

/*
 * This class demonstrates the Bank System
 * using abstraction and polymorphism.
 */
public class BankSys {
    public static void main(String[] args) {

        // Create BankAccount reference with SavingsAccount object
        BankAccount acc = new SavingsAccount("101", "Aayush", 10000);

        // Calculate and display interest
        System.out.println(acc.calculateInterest());
    }
}
