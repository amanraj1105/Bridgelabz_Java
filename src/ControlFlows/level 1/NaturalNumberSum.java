import java.util.Scanner;

/*
 * This class calculates the sum of natural numbers
 * up to a given positive number.
 */
class NaturalNumberSum {
    public static void main(String[] args) {

        // Create Scanner object to take input from the user
        Scanner input = new Scanner(System.in);

        // Read the number from the user
        int number = input.nextInt();

        // Check if the number is a natural number
        if (number > 0) {

            // Calculate sum using the formula n * (n + 1) / 2
            int sum = number * (number + 1) / 2;

            // Display the result
            System.out.println("The sum of " + number + " natural numbers is " + sum);
        } else {

            // Display message for non-natural number
            System.out.println("The number " + number + " is not a natural number");
        }

        // Close the Scanner object
        input.close();
    }
}
