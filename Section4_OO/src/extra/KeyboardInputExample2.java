package extra;

// KeyboardInputExample2.java

// Copyright 2005 by Jacquie Barker - all rights reserved.

import java.util.Scanner;

// A sample main program that prompts the user for command-line keyboard input
// using the Scanner class introduced with version 5.0 of Java.

public class KeyboardInputExample2 {
    public static void main(String args[]) {
	// Note use of print vs. println.
        System.out.print("Please enter your name:  ");
	Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Hello, " + name + "!");
    }
}
