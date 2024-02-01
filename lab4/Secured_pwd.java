import java.util.Scanner;

public class Secured_pwd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter passphrase input: ");
        String input = scanner.nextLine();
        String[] words = input.split(" ");
        String output = "";

        for (String word : words) {
            output += word.charAt(0);
            output += word.charAt(word.length() - 1);
        }
        System.out.println("Secured password for this passphrase: " + output.toUpperCase());
    }
}
