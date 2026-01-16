import java.util.Scanner;

/*
 * This class checks whether a number is
 * positive, negative, or zero.
 */
class NumberSignChecker {
    public static void main(String[] args) {

        // Create Scanner object to take input from the user
        Scanner input = new Scanner(System.in);

        // Read the number from the user
        int number = input.nextInt();

        // Check the sign of the number
        if (number > 0) {
            System.out.println("positive");
        } else if (number < 0) {
            System.out.println("negative");
        } else {
            System.out.println("zero");
        }

        // Close the Scanner object
        input.close();
    }
}
