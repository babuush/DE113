import javax.swing.*;

class Ch9CountVowels {

    public static void main (String[] args) {

        String    name;

        int       numberOfCharacters,
                  vowelCount = 0;

        char      letter;

        name = JOptionPane.showInputDialog(null, "What is your name?");

        numberOfCharacters = name.length();

        for (int i = 0; i < numberOfCharacters; i++) {

            letter = name.charAt(i);

            if (   letter == 'a' || letter == 'A' ||
                   letter == 'e' || letter == 'E' ||
                   letter == 'i' || letter == 'I' ||
                   letter == 'o' || letter == 'O' ||
                   letter == 'u' || letter == 'U'     ) {

                vowelCount++;
            }
        }

        JOptionPane.showMessageDialog(null, name + ", your name has " +
                                            vowelCount + " vowels");


    }

}