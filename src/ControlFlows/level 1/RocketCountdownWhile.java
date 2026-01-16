import java.util.Scanner;

/*
 * This class performs a rocket countdown
 * from a given number down to 1 using a while loop.
 */
class RocketCountdownWhile {
    public static void main(String[] args) {

        // Create Scanner object to take input from the user
        Scanner input = new Scanner(System.in);

        // Read the starting number for countdown
        int counter = input.nextInt();

        // Countdown from the given number to 1
        while (counter >= 1) {
            System.out.println(counter);
            counter--;
        }

        // Close the Scanner object
        input.close();
    }
}
