package computrade.puzzels;

import static org.junit.Assert.*;
import org.junit.Test;

public class FindAnagramStringsTest {
	/**
	 * JUnit test class to test various anagram program for various String
	 * input.
	 */
	
	@Test
	public void testFindAnagramByCheckingOff() {
	
		assertTrue(FindAnagramStrings.isAnagramByCheckingOff("word", "wrdo"));
		assertTrue(FindAnagramStrings.isAnagramByCheckingOff("mary", "army"));
		assertTrue(FindAnagramStrings.isAnagramByCheckingOff("stop", "tops"));
		assertTrue(FindAnagramStrings.isAnagramByCheckingOff("listen", "silent"));
		assertTrue(FindAnagramStrings.isAnagramByCheckingOff("listen", "SILENT"));
		assertTrue(FindAnagramStrings.isAnagramByCheckingOff("a", "a"));
		assertTrue(FindAnagramStrings.isAnagramByCheckingOff("", ""));
		
		assertFalse(FindAnagramStrings.isAnagramByCheckingOff("pure", "purr"));
		assertFalse(FindAnagramStrings.isAnagramByCheckingOff("fill", "fil"));
		assertFalse(FindAnagramStrings.isAnagramByCheckingOff("b", "bbb"));
		assertFalse(FindAnagramStrings.isAnagramByCheckingOff("ccc", "ccccccc"));
		assertFalse(FindAnagramStrings.isAnagramByCheckingOff("sleep", "slep"));
		
		try {
			FindAnagramStrings.isAnagramByCheckingOff(null, null);
		    fail("expected IllegalArgumentException exception was not occured.");
		} catch(IllegalArgumentException e) {
		        //if execution reaches here, 
		        //it indicates this exception was occured.
		        //so we need not handle it.
		}


	}
	
	
	@Test
	public void testFindAnagramBySort() {
	
		assertTrue(FindAnagramStrings.isAnagramBySort("word", "wrdo"));
		assertTrue(FindAnagramStrings.isAnagramBySort("mary", "army"));
		assertTrue(FindAnagramStrings.isAnagramBySort("stop", "tops"));
		assertTrue(FindAnagramStrings.isAnagramBySort("listen", "silent"));
		assertTrue(FindAnagramStrings.isAnagramBySort("listen", "SILENT"));
		assertTrue(FindAnagramStrings.isAnagramBySort("a", "a"));
		assertTrue(FindAnagramStrings.isAnagramBySort("", ""));
		
		assertFalse(FindAnagramStrings.isAnagramBySort("pure", "purr"));
		assertFalse(FindAnagramStrings.isAnagramBySort("fill", "fil"));
		assertFalse(FindAnagramStrings.isAnagramBySort("b", "bbb"));
		assertFalse(FindAnagramStrings.isAnagramBySort("ccc", "ccccccc"));
		assertFalse(FindAnagramStrings.isAnagramBySort("sleep", "slep"));
		
		try {
			FindAnagramStrings.isAnagramBySort(null, null);
		    fail("expected IllegalArgumentException exception was not occured.");
		} catch(IllegalArgumentException e) {
		        //if execution reaches here, 
		        //it indicates this exception was occured.
		        //so we need not handle it.
		}


	}

	@Test
	public void testFindAnagramBySubstring() {

		assertTrue(FindAnagramStrings.isAnagramBySubstring("word", "wrdo"));
		assertTrue(FindAnagramStrings.isAnagramBySubstring("mary", "army"));
		assertTrue(FindAnagramStrings.isAnagramBySubstring("stop", "tops"));
		assertTrue(FindAnagramStrings.isAnagramBySubstring("listen", "silent"));
		assertTrue(FindAnagramStrings.isAnagramBySubstring("listen", "SILENT"));
		assertTrue(FindAnagramStrings.isAnagramBySubstring("a", "a"));
		assertTrue(FindAnagramStrings.isAnagramBySubstring("", ""));
		
		assertFalse(FindAnagramStrings.isAnagramBySubstring("pure", "purr"));
		assertFalse(FindAnagramStrings.isAnagramBySubstring("fill", "fil"));
		assertFalse(FindAnagramStrings.isAnagramBySubstring("b", "bbb"));
		assertFalse(FindAnagramStrings.isAnagramBySubstring("ccc", "ccccccc"));
		assertFalse(FindAnagramStrings.isAnagramBySubstring("sleep", "slep"));
		
		try {
			FindAnagramStrings.isAnagramBySubstring(null, null);
		    fail("expected IllegalArgumentException exception was not occured.");
		} catch(IllegalArgumentException e) {
		        //if execution reaches here, 
		        //it indicates this exception was occured.
		        //so we need not handle it.
		}

	}


	@Test
	public void testFindAnagramBySBDelete() {
		
		assertTrue(FindAnagramStrings.checkAnagramBySBDelete("word", "wrdo"));
		assertTrue(FindAnagramStrings.checkAnagramBySBDelete("mary", "army"));
		assertTrue(FindAnagramStrings.checkAnagramBySBDelete("stop", "tops"));
		assertTrue(FindAnagramStrings.checkAnagramBySBDelete("listen", "silent"));
		assertTrue(FindAnagramStrings.checkAnagramBySBDelete("listen", "SILENT"));
		assertTrue(FindAnagramStrings.checkAnagramBySBDelete("a", "a"));
		assertTrue(FindAnagramStrings.checkAnagramBySBDelete("", ""));
		
		assertFalse(FindAnagramStrings.checkAnagramBySBDelete("pure", "purr"));
		assertFalse(FindAnagramStrings.checkAnagramBySBDelete("fill", "fil"));
		assertFalse(FindAnagramStrings.checkAnagramBySBDelete("b", "bbb"));
		assertFalse(FindAnagramStrings.checkAnagramBySBDelete("ccc", "ccccccc"));
		assertFalse(FindAnagramStrings.checkAnagramBySBDelete("sleep", "slep"));
		
		try {
			FindAnagramStrings.checkAnagramBySBDelete(null, null);
		    fail("expected IllegalArgumentException exception was not occured.");
		} catch(IllegalArgumentException e) {
		        //if execution reaches here, 
		        //it indicates this exception was occured.
		        //so we need not handle it.
		}

	}
	
	@Test
	public void testIsAnagramByCountAndCompare() {
		
		assertTrue(FindAnagramStrings.isAnagramByCountAndCompare("word", "wrdo"));
		assertTrue(FindAnagramStrings.isAnagramByCountAndCompare("mary", "army"));
		assertTrue(FindAnagramStrings.isAnagramByCountAndCompare("stop", "tops"));
		assertTrue(FindAnagramStrings.isAnagramByCountAndCompare("listen", "silent"));
		assertTrue(FindAnagramStrings.isAnagramByCountAndCompare("listen", "SILENT"));
		assertTrue(FindAnagramStrings.isAnagramByCountAndCompare("a", "a"));
		assertTrue(FindAnagramStrings.isAnagramByCountAndCompare("", ""));
		
		assertFalse(FindAnagramStrings.isAnagramByCountAndCompare("pure", "purr"));
		assertFalse(FindAnagramStrings.isAnagramByCountAndCompare("fill", "fil"));
		assertFalse(FindAnagramStrings.isAnagramByCountAndCompare("b", "bbb"));
		assertFalse(FindAnagramStrings.isAnagramByCountAndCompare("ccc", "ccccccc"));
		assertFalse(FindAnagramStrings.isAnagramByCountAndCompare("sleep", "slep"));
		
		try {
			FindAnagramStrings.isAnagramByCountAndCompare(null, null);
		    fail("expected IllegalArgumentException exception was not occured.");
		} catch(IllegalArgumentException e) {
		        //if execution reaches here, 
		        //it indicates this exception was occured.
		        //so we need not handle it.
		}

	}
}
