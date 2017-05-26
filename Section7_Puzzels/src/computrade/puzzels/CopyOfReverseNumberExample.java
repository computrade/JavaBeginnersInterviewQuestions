package computrade.puzzels;

import java.util.Scanner;


public class CopyOfReverseNumberExample {

    public static void main(String args[]) {
       //input number to reverse
        System.out.println("Please enter number to be reversed using Java program: ");
        int number = new Scanner(System.in).nextInt();
        System.out.println("Reverse of number: " + number + " is " + reverse(number));   
    
    }
  
    /*
     * reverse a number in Java using iteration
     * @return reverse of number
     */
    public static int reverse(int number){
     	
    	int reminder = 0 ;
    	int reverse = 0;
    
    	do{
    		reminder = number%10;
    		reverse = reverse*10 + reminder;
    		number = number/10;
    		
    	}while(number > 0 );
   	
    	return reverse;
    }

}


