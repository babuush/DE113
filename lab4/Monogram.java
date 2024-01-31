import java.util.Scanner;

public class Monogram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your full name: ");
        String fullName = scanner.nextLine();
        //
        StringBuilder initials = new StringBuilder();
        for (String name : fullName.split(" ")) {
            initials.append(name.charAt(0));
        }
        System.out.println("Initials: " + initials.toString().toUpperCase());
    }
}