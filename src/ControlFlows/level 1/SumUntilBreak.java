import java.util.Scanner;

/*
 * This class continuously reads numbers from the user
 * and calculates their sum until a non-positive number
 * is entered.
 */
class SumUntilBreak {
    public static void main(String[] args) {

        // Create Scanner object to take input from the user
        Scanner input = new Scanner(System.in);

        // Variable to store the total sum
        double total = 0.0;

        // Infinite loop to keep taking input
        while (true) {

            // Read a number from the user
            double value = input.nextDouble();

            // Break the loop if value is zero or negative
            if (value <= 0) {
                break;
            }

            // Add value to total sum
            total += value;
        }

        // Display the total sum
        System.out.println("The total sum is " + total);

        // Close the Scanner object
        input.close();
    }
}
