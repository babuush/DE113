import java.util.Scanner;

public class Vowels {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input: ");
        String InputString = scanner.nextLine();
        String Input = InputString.toLowerCase();
        StringBuilder Vowels = new StringBuilder();
        StringBuilder Consonants = new StringBuilder();
        for (String Alphabet : Input.split("")) {
            if ((Alphabet.equals("a")) || (Alphabet.equals("e")) || (Alphabet.equals("i"))
                    || (Alphabet.equals("o")) || (Alphabet.equals("u"))) {
                Vowels.append(Alphabet);
            } else {
                Consonants.append(Alphabet);
            }
        }
        String AllVowels = Vowels.toString();
        String AllConsonants = Consonants.toString();
        System.out.println("Vowels: " + AllVowels.length() + ", Consonants: " + AllConsonants.length());
    }
}
