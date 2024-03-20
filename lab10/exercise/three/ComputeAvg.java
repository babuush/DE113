package exercise.three;

import java.util.Scanner;

public class ComputeAvg {
    public static void main(String[] args) {
        double[] scoreArray = new double[5];
        double averageScore = 0, sum = 0;
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter the score " + i);
            scoreArray[i] = scanner.nextInt();
            sum += scoreArray[i];
        }
        averageScore = sum / 5;
        System.out.println("Average test score is:" + averageScore);
    }
}
