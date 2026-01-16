import java.util.Scanner;

/*
 * This class calculates and displays the multiplication results
 * of a given number from 6 to 9 using an array.
 */
public class MultiplicationTableSixToNine {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number = input.nextInt();
        int[] multiplicationResult = new int[4]; // for 6, 7, 8, 9

        // Store results for 6 to 9
        int index = 0;
        for (int i = 6; i <= 9; i++) {
            multiplicationResult[index] = number * i;
            index++;
        }

        // Display results
        index = 0;
        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + multiplicationResult[index]);
            index++;
        }

        input.close();
    }
}
