import java.util.Scanner;

/*
 * This class prints whether numbers from 1 to a given
 * number are odd or even.
 */
class OddEvenPrinter {

    public static void main(String[] args) {

        // Create Scanner object to take input from the user
        Scanner input = new Scanner(System.in);

        // Read the number from the user
        int number = input.nextInt();

        // Check if the number is positive
        if (number > 0) {

            // Loop from 1 to the given number
            for (int i = 1; i <= number; i++) {

                // Check if the current number is even or odd
                if (i % 2 == 0) {
                    System.out.println(i + " is even");
                } else {
                    System.out.println(i + " is odd");
                }
            }
        }

        // Close the Scanner object
        input.close();
    }
}
