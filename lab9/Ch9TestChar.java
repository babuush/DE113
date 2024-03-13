/*
    Introduction to OOP with Java 4th Ed, McGraw-Hill

    Wu/Otani

    Chapter 9 Sample Program: Char data type operations

    File: Ch9TestChar.java

*/

import javax.swing.*;

class Ch9TestChar {
    public static void main (String[] args) {

        char ch1, ch2 = 'X';

        JOptionPane.showMessageDialog(null,
                                      "ASCII code of character X is " + (int)'X' );

        JOptionPane.showMessageDialog(null,
                                      "Character with ASCII code 88 is " + (char)88 );
    }
}