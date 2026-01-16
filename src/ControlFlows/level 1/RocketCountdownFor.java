import java.util.Scanner;

/*
 * This class performs a rocket countdown
 * from a given number down to 1 using a for loop.
 */
class RocketCountdownFor {
    public static void main(String[] args) {

        // Create Scanner object to take input from the user
        Scanner input = new Scanner(System.in);

        // Read the starting number for countdown
        int number = input.nextInt();

        // Countdown from the given number to 1
        for (int i = number; i >= 1; i--) {
            System.out.println(i);
        }

        // Close the Scanner object
        input.close();
    }
}
