import java.text.DecimalFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Random;
import java.util.Scanner;

public class TaxCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        DecimalFormat decimalFormat = new DecimalFormat("0.00");


        // Accept input taxable income (year)
        System.out.print("Enter taxable income for the year: ");
        double taxableIncome = Double.parseDouble(scanner.nextLine());

        // Compute tax including a random bonus income
        double bonusIncome = 5000 + random.nextDouble() * (10000 - 5000);
        double totalIncome = taxableIncome + bonusIncome;

        double tax = getTax(totalIncome);

        // Compute the number of days left for personal income tax
        GregorianCalendar currentDate = new GregorianCalendar();
        GregorianCalendar taxDueDate = new GregorianCalendar(currentDate.get(Calendar.YEAR) + 1, Calendar.MARCH, 31);

        long daysLeft = (taxDueDate.getTimeInMillis() - currentDate.getTimeInMillis()) / (24 * 60 * 60 * 1000);

        // Display results
        System.out.println("Taxable Income: " + decimalFormat.format(totalIncome));
        System.out.println("Tax to be paid: " + decimalFormat.format(tax));
        System.out.println("Days left for personal income tax 2024: " + daysLeft + " days");
    }

    private static double getTax(double totalIncome) {
        double tax;

        if (totalIncome <= 150000) {
            tax = 0;
        } else if (totalIncome <= 300000) {
            tax = (totalIncome - 150000) * 0.05;
        } else if (totalIncome <= 500000) {
            tax = (totalIncome - 300000) * 0.10 + 7500;
        } else if (totalIncome <= 750000) {
            tax = (totalIncome - 500000) * 0.15 + 27500;
        } else if (totalIncome <= 1000000) {
            tax = (totalIncome - 750000) * 0.20 + 65000;
        } else if (totalIncome <= 2000000) {
            tax = (totalIncome - 1000000) * 0.25 + 115000;
        } else if (totalIncome <= 5000000) {
            tax = (totalIncome - 2000000) * 0.30 + 365000;
        } else {
            tax = (totalIncome - 5000000) * 0.35 + 1265000;
        }
        return tax;
    }
}
