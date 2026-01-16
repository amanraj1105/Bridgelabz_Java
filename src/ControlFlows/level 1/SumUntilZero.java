import java.util.Scanner;

/*
 * This class calculates the sum of numbers entered by the user
 * until zero is entered.
 */
class SumUntilZero {
    public static void main(String[] args) {

        // Create Scanner object to take input from the user
        Scanner input = new Scanner(System.in);

        // Variable to store the total sum
        double total = 0.0;

        // Read the first number
        double value = input.nextDouble();

        // Keep adding numbers until the user enters zero
        while (value != 0) {

            // Add the current value to the total
            total += value;

            // Read the next number
            value = input.nextDouble();
        }

        // Display the total sum
        System.out.println("The total sum is " + total);

        // Close the Scanner object
        input.close();
    }
}
