package extra;

// KeyboardInput.java

// Copyright 2005 by Jacquie Barker - all rights reserved.

import java.io.*;

// A utility class that provides a single static method for reading keyboard
// input from the command line window (via System.in).
// Each call to the static method KeyboardInput.readLine() returns a
// String representing a line's worth of input (up until the user 
// presses the Enter key).

public class KeyboardInput {
    public static String readLine() {
        // We'll gather up individual characters one by one using a 
        // StringBuffer.
        StringBuffer input = new StringBuffer("");

        try {
            // Read one integer, and cast it into a character.
            char in = (char) System.in.read();

            // Keep going until we detect a newline character (\n), which is
            // generated when a user presses the Enter key on the keyboard.
            while (in != '\n') {   
                input.append(in);

                // Read the next character.
                in = (char) System.in.read();
            }
        }
        catch (IOException e) {
	    // We won't do any sort of recovery.
        }

        // Strip off any leading/trailing white space.
        return input.toString().trim();
    }
}
