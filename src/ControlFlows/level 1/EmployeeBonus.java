import java.util.Scanner;

/*
 * This class calculates the bonus of an employee
 * based on years of service.
 */
class EmployeeBonus {
    public static void main(String[] args) {

        // Create Scanner object to take input from user
        Scanner input = new Scanner(System.in);

        // Read employee salary
        double salary = input.nextDouble();

        // Read years of service
        int yearsOfService = input.nextInt();

        // Check if employee is eligible for bonus
        if (yearsOfService > 5) {

            // Calculate 5% bonus
            double bonus = salary * 0.05;

            // Display bonus amount
            System.out.println("The bonus amount is " + bonus);
        } else {

            // If service is 5 years or less, no bonus
            System.out.println("No bonus applicable");
        }

        // Close the Scanner object
        input.close();
    }
}
