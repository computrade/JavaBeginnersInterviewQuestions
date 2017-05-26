package computrade.collections.list;

import java.util.ArrayList;
import java.util.List;

// This class is using Collection methods using ArrayList implementation.
 
//*********Tip**************  
//The toString() method of the list (and all types of collections) returns a comma-separated list of elements enclosed in brackets.
//If a collection is empty, an empty pair of brackets ([]) is returned.
//The string is very useful for debugging purposes, provided each element has a reasonable toString() implementation.
//**********************
public class ListExample {
	
	public static void main(String[] args) {
        // Create a list of strings
        List<String> names = new ArrayList<>();

        // Print the list details
        System.out.printf("After creation: Size = %d, Elements = %s%n", names.size(), names);

        // Add some names to the list
        names.add("Alice");
        names.add("Bob");
        names.add("Charly");

        // Print the list details
        System.out.printf("After adding 3 elements: Size = %d, Elements = %s%n",
                names.size(), names);

        // Remove Bob from the list
        names.remove("Bob");

        // Print the list details
        System.out.printf("After removing 1 element: Size = %d, Elements = %s%n",
                names.size(), names);

        // Clear all elements
        names.clear();

        // Print the list details
        System.out.printf("After clearing all elements: Size = %d, Elements = %s%n",
                names.size(), names);

}

}
