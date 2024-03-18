import java.util.Scanner;

public class problem10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        while (!sentence.isEmpty())  {
            StringBuffer reversedSentence = new StringBuffer(sentence).reverse();
            System.out.println("reversed sentence = " + reversedSentence);

            System.out.print("Enter a sentence: ");
            sentence = scanner.nextLine();
        }
        System.out.println("Entered an empty string. Exiting now ...");
    }
}
