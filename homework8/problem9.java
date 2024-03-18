import java.util.Scanner;

public class problem9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a character: ");
        String c = scanner.nextLine();

        while ((int) c.charAt(0) != 64) {
            int length = c.length();
            if (length > 1) {
                System.out.println("Error: more than one character entered");
            } else {
                char check = c.charAt(0);
                System.out.println("The ASCII value of" + check + "is" + (int) check);
            }
            System.out.print("Enter a character: ");
            c = scanner.nextLine();
        }
        System.out.println("You entered @. Exiting now ...");
    }
}
