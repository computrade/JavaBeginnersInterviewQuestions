package computrade.puzzels;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 * Java Program to find first duplicate, non-repeated character in a String. It
 * demonstrate three simple example to do this programming problem.
 *
 */
public class FindFirstNonRepeatedCharTest {

	@Test
	public void testFirstNonRepeatedCharacter() {
		assertEquals('b', FindFirstNonRepeatedChar.firstNonRepeatedCharacter("abcdefghija"));
		assertEquals('h', FindFirstNonRepeatedChar.firstNonRepeatedCharacter("hello"));
		assertEquals('J', FindFirstNonRepeatedChar.firstNonRepeatedCharacter("Java"));
		assertEquals('i', FindFirstNonRepeatedChar.firstNonRepeatedCharacter("simplest"));
	}

	@Test
	public void testFirstNonRepeatingChar() {
		assertEquals('b', FindFirstNonRepeatedChar.firstNonRepeatingChar("abcdefghija"));
		assertEquals('h', FindFirstNonRepeatedChar.firstNonRepeatingChar("hello"));
		assertEquals('J', FindFirstNonRepeatedChar.firstNonRepeatingChar("Java"));
		assertEquals('i', FindFirstNonRepeatedChar.firstNonRepeatingChar("simplest"));
	}

}
