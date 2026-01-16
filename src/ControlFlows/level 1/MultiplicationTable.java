import java.util.Scanner;

/*
 * This class prints the multiplication table
 * of a given number from 1 to 10.
 */
class MultiplicationTable {
    public static void main(String[] args) {

        // Create Scanner object to take input from the user
        Scanner input = new Scanner(System.in);

        // Read the number from the user
        int number = input.nextInt();

        // Loop from 1 to 10 to generate the multiplication table
        for (int i = 1; i <= 10; i++) {

            // Print multiplication result
            System.out.println(number + " * " + i + " = " + (number * i));
        }

        // Close the Scanner object
        input.close();
    }
}
