/*
    Introduction to OOP with Java 4th Ed, McGraw-Hill

    Wu/Otani

    Chapter 9 Sample Program: Checks whether the input
            string conforms to the phone number
            pattern xxx-xxx-xxxx.  This version
            uses the Matcher and Pattern classes.

    File: Ch9MatchPhoneNumber2.java
*/

import javax.swing.*;
import java.util.regex.*;

class Ch9MatchPhoneNumber2 {

    private static final String STOP = "0";
    private static final String VALID = "Valid phone number";
    private static final String INVALID = "Not a valid phone number";

    private static final String VALID_PHONE_PATTERN
                   = "[0-9][0-9][0-9]-[0-9][0-9][0-9]-[0-9][0-9][0-9][0-9]";

                // = "[0-9]{3}-[0-9]{3}-[0-9]{4}";

                // = "\\d{3}-\\d{3}-\\d{4}";

    public static void main (String[] args) {

        String phoneStr, reply;

        Pattern phonePattern = Pattern.compile(VALID_PHONE_PATTERN);
        Matcher phoneMatcher;

        while (true) {

            phoneStr = JOptionPane.showInputDialog(null, "Phone#:");

            if (phoneStr.equals(STOP)) break;

            phoneMatcher = phonePattern.matcher(phoneStr);

            if (phoneMatcher.matches()) {
                reply = VALID;

            } else {
                reply = INVALID;
            }

            JOptionPane.showMessageDialog(null,
                                          phoneStr + ":\n" + reply);
        }
    }
}