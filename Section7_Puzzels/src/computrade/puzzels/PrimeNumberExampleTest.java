package computrade.puzzels;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Simple Java program to print prime numbers from 1 to 100 or any number.
 * A prime number is a number which is greater than 1 and divisible
 * by either 1 or itself.
 */
public class PrimeNumberExampleTest {
	
	@Test
	public void testIsPrime() {

		assertTrue(PrimeNumberExample.isPrime(3));
		assertTrue(PrimeNumberExample.isPrime(5));
		assertFalse(PrimeNumberExample.isPrime(10));
		assertFalse(PrimeNumberExample.isPrime(21));
		assertTrue(PrimeNumberExample.isPrime(23));
		assertTrue(PrimeNumberExample.isPrime(127));
		
	}
	

}

