import java.util.Scanner;

public class problem11 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Sentence: ");
        String sentence = scanner.nextLine();

        // Loop until an empty sentence is returned.
        while (!sentence.isEmpty()) {

            // Variables to keep a count of the vowels.
            int a = 0, e = 0, i = 0, o = 0, u = 0;

            // Scan each character in the sentence.
            for (int c = 0; c < sentence.length(); c++) {
                char ch = Character.toLowerCase(sentence.charAt(c));
                if (ch == 'a') a++;
                if (ch == 'e') e++;
                if (ch == 'i') i++;
                if (ch == 'o') o++;
                if (ch == 'u') u++;
            }

            // Display the result.
            System.out.println("Vowel counts for " + sentence);
            System.out.println("Number of 'a': " + a);
            System.out.println("Number of 'e': " + e);
            System.out.println("Number of 'i': " + i);
            System.out.println("Number of 'o': " + o);
            System.out.println("Number of 'u': " + u);
            System.out.println("Enter next Sentence: ");
            sentence = scanner.nextLine();
        }
        System.out.println("Entered an empty input. Exiting now...");
    }
}