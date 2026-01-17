package ObjectOrientedProgramming.ClassAndObject.level2;

import java.util.Scanner;

/*
 * This class checks whether a given string
 * is a palindrome or not.
 */
class PalindromeChecker {

    // String to be checked
    String text;

    // Constructor to initialize the string
    PalindromeChecker(String text) {
        this.text = text;
    }

    // Method to check if the string is a palindrome
    boolean isPalindrome() {

        // Initialize start and end indexes
        int start = 0;
        int end = text.length() - 1;

        // Compare characters from both ends
        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }

        // If all characters match
        return true;
    }

    // Method to display the result
    void displayResult() {
        if (isPalindrome()) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }
    }
}

/*
 * This class takes a string as input,
 * creates a PalindromeChecker object,
 * and displays whether the string is a palindrome.
 */
public class PalindromeString {
    public static void main(String[] args) {

        // Create Scanner object to take input from the user
        Scanner sc = new Scanner(System.in);

        // Read the string from the user
        String text = sc.nextLine();

        // Create PalindromeChecker object
        PalindromeChecker checker = new PalindromeChecker(text);

        // Display palindrome result
        checker.displayResult();

        // Close the Scanner object
        sc.close();
    }
}
