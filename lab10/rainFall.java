import javax.swing.*;

public class rainFall {
    public static void main(String[] args) {
        double[] rainfall = new double[12];
        double annualAverage = 0, sum = 0.0;

        for (int i = 0; i < rainfall.length; i++) {
            rainfall[i] = Double.parseDouble(JOptionPane.showInputDialog(null, "Rainfall for month " + (i + 1)));
            sum += rainfall[i];
            annualAverage = sum / rainfall.length;
        }
        JOptionPane.showMessageDialog(null, "Avg: "+ annualAverage);
    }
}
