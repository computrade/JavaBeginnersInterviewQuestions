package computrade.puzzels;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class ReverseStringTest {
	
	ReverseString rs;
	
	@Before
	public void init(){
		this.rs = new ReverseString();
		
	}
	
	@Test
	public void testReverseStringWithJava() {
	
		assertEquals("EDCBA",rs.reverseJava("ABCDE"));
		assertEquals("21ba",rs.reverseJava("ab12"));
		assertEquals("a",rs.reverseJava("a"));
		assertEquals("aaa",rs.reverseJava("aaa"));
		assertEquals("aba",rs.reverseJava("aba"));
		assertEquals("bbbaa",rs.reverseJava("aabbb"));
	
	}
	
	
	@Test
	public void testReverseStringWithBuilder() {

	
		assertEquals("EDCBA",rs.reverseStringBuilder("ABCDE"));
		assertEquals("21ba",rs.reverseStringBuilder("ab12"));
		assertEquals("a",rs.reverseStringBuilder("a"));
		assertEquals("aaa",rs.reverseStringBuilder("aaa"));
		assertEquals("aba",rs.reverseStringBuilder("aba"));
		assertEquals("bbbaa",rs.reverseStringBuilder("aabbb"));
	
	}
	
	@Test
	public void testReverseStringWithChar() {

		assertEquals("EDCBA",rs.reverseChar("ABCDE"));
		assertEquals("21ba",rs.reverseChar("ab12"));
		assertEquals("a",rs.reverseChar("a"));
		assertEquals("aaa",rs.reverseChar("aaa"));
		assertEquals("aba",rs.reverseChar("aba"));
		assertEquals("bbbaa",rs.reverseChar("aabbb"));
	
	}
	
	@Test
	public void testReverseStringWithRecursion() {

		assertEquals("EDCBA",rs.reverseStringRecursive("ABCDE"));
		assertEquals("21ba",rs.reverseStringRecursive("ab12"));
		assertEquals("a",rs.reverseStringRecursive("a"));
		assertEquals("aaa",rs.reverseStringRecursive("aaa"));
		assertEquals("aba",rs.reverseStringRecursive("aba"));
		assertEquals("bbbaa",rs.reverseStringRecursive("aabbb"));
	}
		
}
