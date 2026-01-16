import java.util.Scanner;

/*
 * This class checks whether a person
 * is eligible to vote based on age.
 */
class VotingEligibility {
    public static void main(String[] args) {

        // Create Scanner object to take input from the user
        Scanner input = new Scanner(System.in);

        // Read the age of the person
        int age = input.nextInt();

        // Check voting eligibility
        if (age >= 18) {
            System.out.println("The person's age is " + age + " and can vote.");
        } else {
            System.out.println("The person's age is " + age + " and cannot vote.");
        }

        // Close the Scanner object
        input.close();
    }
}
