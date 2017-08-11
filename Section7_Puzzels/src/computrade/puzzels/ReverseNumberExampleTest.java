package computrade.puzzels;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;


public class ReverseNumberExampleTest {
	
	
	@Test
	public void testReverseNumber() {
		
		assertEquals(321, ReverseNumberExample.reverse(123));
		assertEquals(1, ReverseNumberExample.reverse(1));
		assertEquals(54, ReverseNumberExample.reverse(45));
		assertEquals(888, ReverseNumberExample.reverse(888));
		
		try {
			ReverseNumberExample.reverse(-123);
		    fail("expected IllegalArgumentException exception was not occured.");
		} catch(IllegalArgumentException e) {
		        //if execution reaches here, it indicates this exception occured.
				//this is the expected result.
		}
			
	}
	
	

}


