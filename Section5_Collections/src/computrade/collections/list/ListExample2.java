package computrade.collections.list;

import java.util.ArrayList;
import java.util.List;
 
//*********Tip**************  
//The toString() method of the list (and all types of collections) returns a comma-separated list of elements enclosed in brackets.
//If a collection is empty, an empty pair of brackets ([]) is returned.
//The string is very useful for debugging purposes, provided each element has a reasonable toString() implementation.
//**********************
public class ListExample2 {
	
	public static void main(String[] args) {
        // Create a list of strings
       

		ListExample2 listExample2 = new ListExample2();
        List<String> names = listExample2.createListOfNames();

    

        // Remove index 2 from the list ( which is the third element ) 
        names.remove(2);

        // Print the list details
        System.out.printf("After removing 1 element: Size = %d, Elements = %s%n",
                names.size(), names);

        
        
        names.add(2,"NewCharly");
        // Print the list details
        System.out.printf("After adding Charly Again: Size = %d, Elements = %s%n",
                names.size(), names);
        
        names.add(2,"NewCharly");
        // Print the list details
        System.out.printf("After adding Charly Again: Size = %d, Elements = %s%n",
                names.size(), names);
        
        // This index is Out Of Bound - Excpetion is thrown.
        names.add(20,"MyLastName");
     

}

	private List<String> createListOfNames() {
		
		List<String> names = new ArrayList<>();
		System.out.printf("After creation: Size = %d, Elements = %s%n", names.size(), names);
		// Add some names to the list
        names.add("Alice");
        names.add("Bob");
        names.add("Charly");
        names.add("Donald");
        names.add("Brian");
        names.add("Steve");
        // Print the list details
     
        // Print the list details
        System.out.printf("After adding 3 elements: Size = %d, Elements = %s%n",
                names.size(), names);
        
        return names;
	}

}
