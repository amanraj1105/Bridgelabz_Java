package ObjectOrientedProgramming.Inheritance;

/*
 * This class represents a generic Bank Account
 * containing common account details.
 */
class BankAccount {

    // Account number of the bank account
    String accountNumber;

    // Current balance in the account
    double balance;

    // Constructor to initialize common account details
    BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
}

/*
 * This class represents a Savings Account
 * which is a type of BankAccount.
 */
class SavingsAccount extends BankAccount {

    // Interest rate for savings account
    double interestRate;

    // Constructor to initialize savings account details
    SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    // Method to display account type
    void displayAccountType() {
        System.out.println("Savings Account");
    }
}

/*
 * This class represents a Checking Account
 * which is a type of BankAccount.
 */
class CheckingAccount extends BankAccount {

    // Withdrawal limit for checking account
    double withdrawalLimit;

    // Constructor to initialize checking account details
    CheckingAccount(String accountNumber, double balance, double withdrawalLimit) {
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }

    // Method to display account type
    void displayAccountType() {
        System.out.println("Checking Account");
    }
}

/*
 * This class represents a Fixed Deposit Account
 * which is a type of BankAccount.
 */
class FixedDepositAccount extends BankAccount {

    // Maturity period of fixed deposit (in months/years)
    int maturityPeriod;

    // Constructor to initialize fixed deposit account details
    FixedDepositAccount(String accountNumber, double balance, int maturityPeriod) {
        super(accountNumber, balance);
        this.maturityPeriod = maturityPeriod;
    }

    // Method to display account type
    void displayAccountType() {
        System.out.println("Fixed Deposit Account");
    }
}
