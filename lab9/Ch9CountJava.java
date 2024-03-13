/*
    Introduction to OOP with Java 4th Ed, McGraw-Hill

    Wu/Otani

    Chapter 9 Sample Program:

            Count the number of times the word 'java' occurs
            in input. Case-insensitive comparison is used here.
            The program terminates when the word STOP (case-sensitive)
            is entered.

    File: Ch9CountJava.java
*/

import static javax.swing.JOptionPane.*;

class Ch9CountJava {

    public static void main (String[] args) {

        int       javaCount  = 0;

        String    word;

        while (true) {

            word = showInputDialog(null, "Next word:");

            if ( word.equals("STOP") )   {
                break;

            } else if ( word.equalsIgnoreCase("Java") ) {
                javaCount++;
            }
        }

        System.out.println("'Java' count: " + javaCount );
    }
}