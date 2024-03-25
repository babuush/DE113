package problem;

import java.util.ArrayList;
import java.util.Scanner;

public class problem12 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter N
        System.out.print("Enter the number of real numbers (N): ");
        int N = scanner.nextInt();

        // Create an ArrayList to store N real numbers
        ArrayList<Double> real = new ArrayList<>();

        // Get input and calculate sum
        double sum = 0;
        for (int i = 0; i < N; i++) {
            System.out.print("Enter real number " + (i + 1) + ": ");
            double num = scanner.nextDouble();
            real.add(num);
            sum += num;
        }

        // Calculate average
        double avg = sum / N;

        // Calculate the sum of squares of deviations from the mean
        double a = 0;
        for (double num : real) {
            a += Math.pow(num - avg, 2);
        }

        // Calculate standard deviation (population standard deviation)
        double s = Math.sqrt(a / N); // Use population standard deviation for clarity

        // Display the result
        System.out.println("Standard Deviation: " + s);
    }
}
