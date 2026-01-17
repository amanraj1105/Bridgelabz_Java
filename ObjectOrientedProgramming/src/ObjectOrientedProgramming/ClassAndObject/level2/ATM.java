package ObjectOrientedProgramming.ClassAndObject.level2;

import java.util.Scanner;

/*
 * This class represents a Bank Account and provides
 * basic operations such as deposit, withdrawal,
 * and balance display.
 */
class BankAccount {

    // Name of the account holder
    String accountHolder;

    // Account number
    int accountNumber;

    // Current balance in the account
    double balance;

    // Constructor to initialize bank account details
    BankAccount(String accountHolder, int accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Method to deposit money into the account
    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    // Method to withdraw money from the account
    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance");
        }
    }

    // Method to display the current balance
    void displayBalance() {
        System.out.println("Current Balance: " + balance);
    }
}

/*
 * This class simulates an ATM operation by
 * creating a bank account and performing
 * deposit and withdrawal transactions.
 */
public class ATM {
    public static void main(String[] args) {

        // Create Scanner object to take input from the user
        Scanner sc = new Scanner(System.in);

        // Read account holder name
        String name = sc.nextLine();

        // Read account number
        int accNo = sc.nextInt();

        // Read initial balance
        double balance = sc.nextDouble();

        // Create BankAccount object
        BankAccount account = new BankAccount(name, accNo, balance);

        // Read deposit amount and perform deposit
        double depositAmount = sc.nextDouble();
        account.deposit(depositAmount);

        // Read withdrawal amount and perform withdrawal
        double withdrawAmount = sc.nextDouble();
        account.withdraw(withdrawAmount);

        // Display final account balance
        account.displayBalance();

        // Close the Scanner object
        sc.close();
    }
}
