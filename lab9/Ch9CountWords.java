/*
    Introduction to OOP with Java 4th Ed, McGraw-Hill

    Wu/Otani

    Chapter 9 Sample Program: Count the number of words
                                in a given string

    File: Ch9CountWords.java   (Attempt 2)
*/

import javax.swing.*;

class Ch9CountWords {

    private static final char BLANK = ' ';

    public static void main (String[] args) {

        //This is Attempt No. 2
        //
        //Attempt No. 1 is shown in the textbook
        //
        //There is still a problem with the Attempt No. 2 code.
        //If the sentence ends with one or more blank spaces, then the
        //value for wordCount will be one more than the actual number of
        //words in the sentence. It is left as an exercise to correct
        //this bug.

        int     index, wordCount, numberOfCharacters;

        String  sentence = JOptionPane.showInputDialog(null, "Enter a sentence:");

        numberOfCharacters  = sentence.length( );
        index               = 0;
        wordCount           = 0;

        while ( index < numberOfCharacters ) {

            //ignore blank spaces
            while (index < numberOfCharacters &&
                   sentence.charAt(index) == BLANK) {

                index++;
            }

            //now locate the end of the word
            while (index < numberOfCharacters &&
                   sentence.charAt(index) != BLANK) {

                index++;
            }

            //another word is found, so increment the counter
            wordCount++;

        }

        //display the result
        System.out.println( "Input sentence: " + sentence );
        System.out.println("\n");
        System.out.println( "    Word count: " + wordCount + " words" );

    }

}