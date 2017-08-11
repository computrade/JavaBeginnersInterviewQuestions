package computrade.puzzels;

public class ReverseNumberExample {

    /*
     * reverse a number in Java using iteration
     * @return reverse of number
     */
    public static int reverse(int number){
    	
    	if(number<0){
    		throw new IllegalArgumentException("Input should be positive number");
    	}
    	
        int reverse = 0;
        int remainder = 0;
        
        do{
            remainder = number%10;
            reverse = reverse*10 + remainder;
            number = number/10;         
        }while(number > 0);
      
        return reverse;
    }

}


