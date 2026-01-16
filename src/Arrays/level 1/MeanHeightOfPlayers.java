import java.util.Scanner;

/*
 * This class calculates the mean height of a football team
 * using an array of player heights.
 */
public class MeanHeightOfPlayers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[] heights = new double[11];
        double sum = 0.0;

        // Take input for heights
        for (int i = 0; i < heights.length; i++) {
            heights[i] = input.nextDouble();
            sum += heights[i];
        }

        // Calculate mean
        double mean = sum / heights.length;

        System.out.println("The mean height of the football team is " + mean);

        input.close();
    }
}
