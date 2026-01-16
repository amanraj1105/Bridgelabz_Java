import java.util.Scanner;

/*
 * This class checks whether the first number
 * is the smallest among three numbers.
 */
class SmallestNumberChecker {
    public static void main(String[] args) {

        // Create Scanner object to take input from the user
        Scanner input = new Scanner(System.in);

        // Read three integers from the user
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        int number3 = input.nextInt();

        // Check if the first number is the smallest
        boolean isSmallest = number1 < number2 && number1 < number3;

        // Display the result
        System.out.println("Is the first number the smallest? " + isSmallest);

        // Close the Scanner object
        input.close();
    }
}
