package computrade.puzzels;

import static org.junit.Assert.*;
import org.junit.Test;

public class FindAnagramStringsTest {
	/**
	 * JUnit test class to test various anagram program for various String
	 * input.
	 */

	@Test
	public void testIsAnagram() {

		assertTrue(FindAnagramStrings.isAnagramBySubstring("word", "wrdo"));
		assertTrue(FindAnagramStrings.isAnagramBySubstring("mary", "army"));
		assertTrue(FindAnagramStrings.isAnagramBySubstring("stop", "tops"));
		assertTrue(FindAnagramStrings.isAnagramBySubstring("boat", "btoa"));
		assertFalse(FindAnagramStrings.isAnagramBySubstring("pure", "in"));
		assertFalse(FindAnagramStrings.isAnagramBySubstring("fill", "fil"));
		assertFalse(FindAnagramStrings.isAnagramBySubstring("b", "bbb"));
		assertFalse(FindAnagramStrings.isAnagramBySubstring("ccc", "ccccccc"));
		assertTrue(FindAnagramStrings.isAnagramBySubstring("a", "a"));
		assertFalse(FindAnagramStrings.isAnagramBySubstring("sleep", "slep"));

	}

	@Test
	public void testFindAnagram() {
		assertTrue(FindAnagramStrings.isAnagramBySort("word", "wrdo"));
		assertTrue(FindAnagramStrings.isAnagramBySort("boat", "btoa"));
		assertFalse(FindAnagramStrings.isAnagramBySort("pure", "in"));
		assertFalse(FindAnagramStrings.isAnagramBySort("fill", "fil"));
		assertTrue(FindAnagramStrings.isAnagramBySort("a", "a"));
		assertFalse(FindAnagramStrings.isAnagramBySort("b", "bbb"));
		assertFalse(FindAnagramStrings.isAnagramBySort("ccc", "ccccccc"));
		assertFalse(FindAnagramStrings.isAnagramBySort("sleep", "slep"));

	}

	@Test
	public void testcheckAnagram() {
		assertTrue(FindAnagramStrings.checkAnagramBySBDelete("word", "wrdo"));
		assertFalse(FindAnagramStrings.checkAnagramBySBDelete("b", "bbb"));
		assertFalse(FindAnagramStrings.checkAnagramBySBDelete("ccc", "ccccccc"));
		assertTrue(FindAnagramStrings.checkAnagramBySBDelete("a", "a"));
		assertFalse(FindAnagramStrings.checkAnagramBySBDelete("sleep", "slep"));
		assertTrue(FindAnagramStrings.checkAnagramBySBDelete("boat", "btoa"));
		assertFalse(FindAnagramStrings.checkAnagramBySBDelete("pure", "in"));
		assertFalse(FindAnagramStrings.checkAnagramBySBDelete("fill", "fil"));

	}
}
