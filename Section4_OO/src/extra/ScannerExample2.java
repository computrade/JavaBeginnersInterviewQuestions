package extra;

import java.util.Scanner;
import java.util.InputMismatchException;

public class ScannerExample2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

	// Prompt the user for his/her first name.
        System.out.print("Please enter your FIRST name (only):  ");
        String name = sc.next();
        
        int age = 0;
        while (age == 0) {
            System.out.print("Please enter your age as an integer:  ");
            if (sc.hasNextInt()) age = sc.nextInt();
            else System.out.println("Whoops!  " + sc.next() + " isn't a proper integer ...");
        }

        double temperature = 0.0;
        while (temperature == 0.0) {
            System.out.print("Please enter your current body temperature (degrees F):  ");
            if (sc.hasNextDouble()) temperature = sc.nextDouble();
            else System.out.println("Whoops!  " + sc.next() + " isn't a proper double ...");
        }

        System.out.println(name + " is " + age + " years old.");
        System.out.println(name + "'s temparature is " + temperature + " degrees F.");
    }
}
