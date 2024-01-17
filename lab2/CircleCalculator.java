import java.util.Scanner;
import java.lang.Math;
import java.text.DecimalFormat;

public class CircleCalculator {
    public static void main(String[] args) {
        Scanner scanner;
        scanner = new Scanner(System.in);
        System.out.print("The radius is ");
        double radius = scanner.nextDouble();
        DecimalFormat df = new DecimalFormat("0.000");

        double area = Math.PI * Math.pow(radius, 2);
        double circumference = Math.PI * radius * 2;
        System.out.println("area = " + df.format(area) + ", circumference = " + df.format(circumference));

    }

}
