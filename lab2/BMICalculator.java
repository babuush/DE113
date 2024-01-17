import java.util.Scanner;
import java.lang.Math;
import java.text.DecimalFormat;

public class BMICalculator {
    public static void main(String[] args){
        DecimalFormat df = new DecimalFormat("0.00");
        Scanner scanner;
        scanner = new Scanner(System.in);
        System.out.print("Weight: ");
        int weight = scanner.nextInt();
        System.out.print("Height: ");
        int height = scanner.nextInt();
        double bmi = weight/Math.pow(((double) height /100),2);
        System.out.println("The BMI is " + df.format(bmi));



    }
}
