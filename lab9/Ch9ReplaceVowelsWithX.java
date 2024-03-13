/*
    Introduction to OOP with Java 4th Ed, McGraw-Hill

    Wu/Otani

    Chapter 9 Sample Program: Replace every vowel in a given sentence with 'X'
                              using StringBuffer.

    File: Ch9ReplaceVowelsWithX.java
*/

import javax.swing.*;

/**
 *
 *   Replace every vowel in a given sentence with 'X'.
 *   Use StringBuffer for string manipulation.
 *
 * @author Dr. Caffeine
 *
 */
class Ch9ReplaceVowelsWithX {

    public static void main (String[] args) {

        StringBuilder tempStringBuilder;
        String          inSentence;

        int             numberOfCharacters;
        char            letter;

        inSentence         = JOptionPane.showInputDialog(null, "Enter a sentence:");
        tempStringBuilder   = new StringBuilder(inSentence);

        numberOfCharacters = tempStringBuilder.length();

        for (int index = 0; index < numberOfCharacters; index++) {

          letter = tempStringBuilder.charAt(index);

          if ( letter == 'a' || letter == 'A' ||
               letter == 'e' || letter == 'E' ||
               letter == 'i' || letter == 'I' ||
               letter == 'o' || letter == 'O' ||
               letter == 'u' || letter == 'U'     ) {

              tempStringBuilder.setCharAt(index,'X');
          }
        }

        System.out.println( "Input:  " + inSentence + "\n");
        System.out.println( "Output: " + tempStringBuilder  );
    }
}