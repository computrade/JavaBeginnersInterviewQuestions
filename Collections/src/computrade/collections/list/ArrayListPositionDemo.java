package computrade.collections.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListPositionDemo {

	public static void main(String[] args) {
		// Create a list of strings
		List<String> names = new ArrayList<String>();

		// Print the list details
		System.out.printf("After creation: Size = %d,Elements = %s%n", names.size(), names);

		// Add some names to the list
	    //names.add("Alice"); // index 0
		//names.add("Bob");   // index 1
		//names.add("Charly");// index 2
		//names.add("Diana"); // index 3

		// Print the list details
		//System.out.printf("After adding 4 elements: Size = %d, Elements = %s%n", names.size(), names);

		// Remove the second element (Bob) from the list - all elements were shift to left.
		//names.remove(1);

		// Print the list details
		//System.out.printf("After removing second element: Size = %d, Elements = %s%n", names.size(), names);

		// Adding the second element (Bob2) again to the list - all elements were shift to right.
		//names.add(1, "Bob2");

		// Print the list details
		//System.out.printf("After adding second element again: Size = %d, Elements = %s%n", names.size(), names);

		// Clear all elements
		//names.clear();

		// Print the list details
		//System.out.printf("After clearing all elements: Size = %d, Elements = %s%n", names.size(), names);

		// This index is Out Of Bound - Exception is thrown.
		//names.add(3, "Diana");

		// I can add elements one by one as much as I want.
		//for (int i = 0; i < 25; i++) {
		//	names.add(i, "element" + i);
		//}
		// Print the list details
		//System.out.printf("After adding 25 elements elements: Size = %d, Elements = %s%n", names.size(), names);

	}

}
