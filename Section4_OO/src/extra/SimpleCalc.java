package extra;

// SimpleCalc.java

// Copyright 2005 by Jacquie Barker - all rights reserved.

public class SimpleCalc {
    public static void main(String args[]) {
        // We'll ask the user to input two numeric values to be mathematically combined.
        // These will come in as Strings, however.
        double first = 0.0;
        double second = 0.0;

        for (int i = 1; i <= 2; i++) {
            System.out.print("Please enter a number:  ");
            String sNumber = KeyboardInput.readLine();

            // Let's try to convert the String input into a numeric value.
            double number = 0.0; 

            try {
                number = Double.parseDouble(sNumber);
            }
            catch (NumberFormatException e) {
                System.out.println("Invalid number:  " + sNumber);
                System.out.println("Please try again!");
                System.exit(0);
            }

            // Remember the number;
            if (i == 1) first = number;
            else second = number;
        }

        System.out.print("Please choose an operation (+, -, *, /):  ");
        String operation = KeyboardInput.readLine();

        // Let's try to compute an answer.

        double answer = 0.0;

        if (operation.equals("+"))  answer = first + second;
        else if (operation.equals("-")) answer = first - second;
        else if (operation.equals("*")) answer = first * second;
        else if (operation.equals("/")) answer = first / second;
        else {
            System.out.println("Invalid operation:  " + operation);
            System.out.println("Please try again!");
            System.exit(0);
        }

        System.out.println(first + " " + operation + " " + second + " = " + answer);
    }
}
