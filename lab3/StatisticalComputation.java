import java.util.Scanner;

public class StatisticalComputation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] numbers = new double[10];
        double sum = 0.0;

        // Get ten numbers from the user
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextDouble();
            sum += numbers[i];
        }

        // Calculate the mean (average) of the entered numbers
        double mean = sum / 10;

        // Calculate the sum of squared differences from the mean
        double sumOfSquaredDifferences = 0.0;
        for (int i = 0; i < 10; i++) {
            double difference = numbers[i] - mean;
            sumOfSquaredDifferences += difference * difference;
        }

        // Calculate the variance
        double variance = sumOfSquaredDifferences / 10;

        // Calculate the standard deviation
        double standardDeviation = Math.sqrt(variance);


        System.out.println("Sum: " + sum);
        System.out.println("Mean (Average): " + mean);
        System.out.println("Standard Deviation: " + standardDeviation);

        scanner.close();
    }
}
