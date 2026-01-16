import java.util.Scanner;

/*
 * This class calculates the factorial of a positive number
 * using a for loop.
 */
class FactorialFor {
    public static void main(String[] args) {

        // Create Scanner object to take input from user
        Scanner input = new Scanner(System.in);

        // Read the number from user
        int number = input.nextInt();

        // Check if the number is positive
        if (number > 0) {

            // Initialize factorial value
            int factorial = 1;

            // Calculate factorial using for loop
            for (int i = 1; i <= number; i++) {
                factorial *= i;
            }

            // Display the factorial result
            System.out.println("The factorial of " + number + " is " + factorial);
        }

        // Close the Scanner object
        input.close();
    }
}
