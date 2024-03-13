/*
    Introduction to OOP with Java 4th Ed, McGraw-Hill

    Wu/Otani

    Chapter 9 Sample Program: Count the number of vowels
                              in a given string using toUpperCase

    File: Ch9CountVowels2.java
*/

import javax.swing.*;

class Ch9CountVowels2 {

    public static void main (String[] args) {

        String    name, nameUpper;

        int       numberOfCharacters,
                  vowelCount = 0;

        char       letter;

        name = JOptionPane.showInputDialog(null, "What is your name?");

        numberOfCharacters = name.length();
        nameUpper = name.toUpperCase();

        for (int i = 0; i < numberOfCharacters; i++) {

            letter = nameUpper.charAt(i);

            if ( letter == 'A' ||
                 letter == 'E' ||
                 letter == 'I' ||
                 letter == 'O' ||
                 letter == 'U'     ) {

                vowelCount++;
            }
        }

        JOptionPane.showMessageDialog(null, name + ", your name has " +
                                            vowelCount + " vowels");
    }
}