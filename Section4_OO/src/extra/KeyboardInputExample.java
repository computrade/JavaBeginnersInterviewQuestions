package extra;

// KeyboardInputExample.java

// Copyright 2005 by Jacquie Barker - all rights reserved.

import java.util.*;
import java.io.*;

// A sample main program that prompts the user for command-line keyboard input.

public class KeyboardInputExample {
    public static void main(String args[]) {
	// Note use of print vs. println.
        System.out.print("Please enter your name:  ");
        String name = KeyboardInput.readLine();
        System.out.println("Hello, " + name + "!");
    }
}
