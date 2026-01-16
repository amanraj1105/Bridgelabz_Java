import java.util.Scanner;

/*
 * This class calculates the sum of natural numbers
 * using both a formula and a for loop.
 */
class NaturalNumberSumFor {
    public static void main(String[] args) {

        // Create Scanner object to take input from the user
        Scanner input = new Scanner(System.in);

        // Read the number from the user
        int number = input.nextInt();

        // Check if the number is a natural number
        if (number > 0) {

            // Calculate sum using the mathematical formula
            int formulaSum = number * (number + 1) / 2;

            // Initialize sum for loop calculation
            int loopSum = 0;

            // Calculate sum using for loop
            for (int i = 1; i <= number; i++) {
                loopSum += i;
            }

            // Display both results
            System.out.println(
                "Sum using formula = " + formulaSum +
                " and sum using for loop = " + loopSum
            );
        }

        // Close the Scanner object
        input.close();
    }
}
