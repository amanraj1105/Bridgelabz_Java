import java.util.Scanner;

/*
 * This class calculates the factorial of a positive number
 * using a while loop.
 */
class FactorialWhile {
    public static void main(String[] args) {

        // Create Scanner object to take input from the user
        Scanner input = new Scanner(System.in);

        // Read the number from the user
        int number = input.nextInt();

        // Check if the number is positive
        if (number > 0) {

            // Initialize factorial value
            int factorial = 1;

            // Initialize loop counter
            int i = 1;

            // Calculate factorial using while loop
            while (i <= number) {
                factorial *= i;
                i++;
            }

            // Display the factorial result
            System.out.println("The factorial of " + number + " is " + factorial);
        }

        // Close the Scanner object
        input.close();
    }
}
