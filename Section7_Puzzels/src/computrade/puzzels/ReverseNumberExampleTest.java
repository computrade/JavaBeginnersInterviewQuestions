package computrade.puzzels;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;


public class ReverseNumberExampleTest {
	
	
	@Test
	public void testReverseNumber() {
		
		assertEquals(1, ReverseNumberExample.reverse(1));
		assertEquals(21, ReverseNumberExample.reverse(12));
		assertEquals(321, ReverseNumberExample.reverse(123));
		assertEquals(111, ReverseNumberExample.reverse(111));
		
		try {
			ReverseNumberExample.reverse(-123);
		    fail("expected IllegalArgumentException exception was not occured.");
		} catch(IllegalArgumentException e) {
		        //if execution reaches here, it indicates this exception occured.
				//this is the expected result.
		}
			
	}
	
	

}


