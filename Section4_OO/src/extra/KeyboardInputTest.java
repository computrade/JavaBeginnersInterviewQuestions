package extra;

// KeyboardInputTest.java

// Copyright 2005 by Jacquie Barker - all rights reserved.

import java.util.*;
import java.io.*;

/** A sample main program that prompts the user for command-line keyboard input. */
public class KeyboardInputTest {
    public static void main(String args[]) {
        // Display instructions.
        System.out.println();
        System.out.println("------------------------------------------------------");
        System.out.println("After each ==> prompt, type whatever you'd like,");
        System.out.println("then press the Enter key.  Press the Enter key without");
        System.out.println("typing anything to exit the program.");
        System.out.println("------------------------------------------------------");
        System.out.println();

        // An infinite loop?  No; note the break statement below.
	while (true) {
                // Prompt the user (note use of print() vs. println()).
                System.out.print("==> ");

                // Put our new utility class to work!
                String line = KeyboardInput.readLine();

                // Check for exit condition.
                if (line.equals("")) break;

                // Display the input back as a test.
                System.out.println("You typed: |" + line + "|");
                System.out.println();
        }
    }
}
