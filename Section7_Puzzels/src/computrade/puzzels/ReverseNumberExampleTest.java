package computrade.puzzels;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class ReverseNumberExampleTest {
	
	
	@Test
	public void testReverseNumber() {

		assertEquals(1, ReverseNumberExample.reverse(1));
		assertEquals(21, ReverseNumberExample.reverse(12));
		assertEquals(321, ReverseNumberExample.reverse(123));
		assertEquals(111, ReverseNumberExample.reverse(111));
		
		
	}
	
	

}


