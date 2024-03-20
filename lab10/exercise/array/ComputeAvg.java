package exercise.array;

import javax.swing.*;
import java.util.Scanner;

public class ComputeAvg {
    public static void main(String[] args) {
        double[] scoreArray = new double[5];
        double averageScore, sum = 0;
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {

            scoreArray[i] = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter score " + (i + 1)));
            sum += scoreArray[i];
        }
        averageScore = sum / 5;
        JOptionPane.showMessageDialog(null, "Avg: "+ averageScore);
    }
}
