import java.util.Scanner;

public class problem9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a character: ");
        String inputVariable = scanner.nextLine();

        // Loop until @ is read.
        while ((int) inputVariable.charAt(0) != 64) {
            int length = inputVariable.length();
            if (length > 1) {
                System.out.println("Error: more than one character entered");
            } else {
                char check = inputVariable.charAt(0);
                System.out.println("The ASCII v" +
                        "value of " + check + " is " + (int) check);
            }
            System.out.print("Enter a character: ");
            inputVariable = scanner.nextLine();
        }
        System.out.println("You entered @. Exiting now ...");
    }
}