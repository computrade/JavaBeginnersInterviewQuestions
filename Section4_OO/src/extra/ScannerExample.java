package extra;

import java.util.Scanner;
import java.util.InputMismatchException;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
                // Prompt the user for his/her first name.
                System.out.print("Please enter your FIRST name (only):  ");
                String name = sc.next();
        
                System.out.print("Please enter your age as an integer:  ");
                int age = sc.nextInt();

                System.out.print("Please enter your GPA as a double:  "); 
                double gpa = sc.nextDouble();

                System.out.println();
                System.out.println(name + " is " + age + " years old.");
                System.out.println(name + "'s GPA is " + gpa + "."); 
        }
        catch (InputMismatchException e) {
                System.out.println();
                System.out.println("Whoops!  You didn't follow the instructions " +
                    "properly; please try again.");
        }
    }
}
