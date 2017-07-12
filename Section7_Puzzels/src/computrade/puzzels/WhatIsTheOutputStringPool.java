package computrade.puzzels;

import org.junit.Test;
import static org.junit.Assert.*;

public class WhatIsTheOutputStringPool {
	
	@Test
	public void test(){
		
		String str1 = "Abracadabra";
		String str2 = "Abra" + "cadabra";
		String str3 = new String("Abracadabra");
		
		assertTrue(str1==str2);
		assertFalse(str1==str3);
		assertFalse(str2==str3);

	}

}
