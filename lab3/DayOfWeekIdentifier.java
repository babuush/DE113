import java.util.Scanner;

public class DayOfWeekIdentifier {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a numerical day of the week (1-7): ");
        int dayNumber = scanner.nextInt();

        String day = getDayOfWeek(dayNumber);

        if (day != null) {
            System.out.println("The day of the week is: "+day);
        } else {
            System.out.println("Invalid input. Please enter a number between 1 and 7.");
        }
    }

    private static String getDayOfWeek(int dayNumber) {
        return switch (dayNumber) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Sunday";
            default -> null; // Invalid input
        };
    }
}
