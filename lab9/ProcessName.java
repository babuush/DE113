import java.util.Scanner;


public class ProcessName {


    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter your name: ");

        // your code goes here

        String nameInput = console.nextLine();
        int spaceIndex = nameInput.indexOf(' ');
        String firstName = nameInput.substring(0, spaceIndex);
        String lastName = nameInput.substring(spaceIndex + 1);
        String name = lastName + ", " + firstName.charAt(0) + ".";
        System.out.println("Your name is: " + name);

    }
}