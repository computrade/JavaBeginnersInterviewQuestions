package computrade.collections.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListResizingDemo {

	public static void main(String[] args) {
		
		// Create a list of strings
		List<String> names = new ArrayList<String>();
		// Print the list details
		System.out.printf("After creation: Size = %d,Elements = %s%n", names.size(), names);

		// I can add elements one by one as much as I want.
		for (int i = 0; i < 17; i++) {
			names.add(i, "element" + i);
		}		
		// Print the list details
		System.out.printf("After adding 16 elements elements: Size = %d, Elements = %s%n", names.size(), names);
		
		// Create a list of strings with initial size of 16.
	    List<String> namesWithCapcity = new ArrayList<String>(16);
        // Print the list size - this is not capacity! 
	 	System.out.printf("After creation: Size = %d,Elements = %s%n", namesWithCapcity.size(), namesWithCapcity);
	 		
	 	//adding elements
		for (int i = 0; i <16 ; i++) {
			namesWithCapcity.add(i, "element" + i);
		}
		// Print the list details
		System.out.printf("After adding 16 elements elements: Size = %d, Elements = %s%n", namesWithCapcity.size(), namesWithCapcity);
		
	}

}
