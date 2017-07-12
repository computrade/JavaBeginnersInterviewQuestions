package computrade.puzzels;

/**
 * Simple Java program to print prime numbers from 1 to 100 or any number.
 * A prime number is a number which is greater than 1 and divisible
 * by either 1 or itself.
 */
public class PrimeNumberExample {

    /*
     * Prime number is not divisible by any number other than 1 and itself
     * @return true if number is prime
     */
    public static boolean isPrime(int number){
        for(int i=2; i<number; i++){
           if(number%i == 0){
               return false; //number is divisible so its not prime
           }
        }
        return true; //number is prime now
    }
}

