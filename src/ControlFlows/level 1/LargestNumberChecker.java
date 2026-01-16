import java.util.Scanner;

/*
 * This class checks which of the three given numbers
 * is the largest using logical operators.
 */
class LargestNumberChecker {
    public static void main(String[] args) {

        // Create Scanner object to take input from the user
        Scanner input = new Scanner(System.in);

        // Read three integers from the user
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        int number3 = input.nextInt();

        // Check if the first number is the largest
        System.out.println("Is the first number the largest? " +
                (number1 >= number2 && number1 >= number3));

        // Check if the second number is the largest
        System.out.println("Is the second number the largest? " +
                (number2 >= number1 && number2 >= number3));

        // Check if the third number is the largest
        System.out.println("Is the third number the largest? " +
                (number3 >= number1 && number3 >= number2));

        // Close the Scanner object
        input.close();
    }
}
