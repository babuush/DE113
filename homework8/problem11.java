import java.util.Scanner;

public class problem11 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Enter a sentence: ");
            String sentence = scanner.nextLine().trim();

            if (sentence.isEmpty()) {
                System.out.println("Exiting...");
                break;
            }

            printResult(sentence);
        }

    }

    public static void printResult(String sentence) {
        int[] vowelCounts = new int[5];

        for (char ch : sentence.toCharArray()) {
            if (ch == 'a') vowelCounts[0]++;
            else if (ch == 'e') vowelCounts[1]++;
            else if (ch == 'i') vowelCounts[2]++;
            else if (ch == 'o') vowelCounts[3]++;
            else if (ch == 'u') vowelCounts[4]++;
        }

        System.out.println("Vowel counts for '" + sentence + "':");
        System.out.println("Number of 'a': " + vowelCounts[0]);
        System.out.println("Number of 'e': " + vowelCounts[1]);
        System.out.println("Number of 'i': " + vowelCounts[2]);
        System.out.println("Number of 'o': " + vowelCounts[3]);
        System.out.println("Number of 'u': " + vowelCounts[4]);
    }

}
