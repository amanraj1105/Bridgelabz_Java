import java.util.Scanner;

/*
 * This class checks whether a given date
 * falls in the Spring season.
 */
class SpringSeason {
    public static void main(String[] args) {

        // Create Scanner object to take input from the user
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter month and day
        System.out.println("Enter month and day:");

        // Read month and day from the user
        int month = input.nextInt();
        int day = input.nextInt();

        // Check if the given date falls in the Spring season
        boolean isSpring =
                (month == 3 && day >= 20) ||  // From March 20
                (month == 4) ||               // April
                (month == 5) ||               // May
                (month == 6 && day <= 20);    // Till June 20

        // Display the result
        if (isSpring) {
            System.out.println("Its a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }

        // Close the Scanner object
        input.close();
    }
}
