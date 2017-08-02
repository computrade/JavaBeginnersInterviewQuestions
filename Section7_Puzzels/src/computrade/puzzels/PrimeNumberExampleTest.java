package computrade.puzzels;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Test;

/**
 * Simple Java program to print prime numbers from 1 to 100 or any number.
 * A prime number is a number which is greater than 1 and divisible
 * by either 1 or itself.
 */
public class PrimeNumberExampleTest {
	
	@Test
	public void testIsPrime() {
		
		assertTrue(PrimeNumberExample.isPrime(2));
		assertTrue(PrimeNumberExample.isPrime(5));
		assertTrue(PrimeNumberExample.isPrime(23));
		assertTrue(PrimeNumberExample.isPrime(127));
		
		assertFalse(PrimeNumberExample.isPrime(10));
		assertFalse(PrimeNumberExample.isPrime(21));
		assertFalse(PrimeNumberExample.isPrime(159));
		
		try {
			PrimeNumberExample.isPrime(-5);
		    fail("expected IllegalArgumentException exception was not occured.");
		} catch(IllegalArgumentException e) {
		        //if execution reaches here, it indicates this exception occured.
				//this is the expected result.
		}
	
	}
	

}

