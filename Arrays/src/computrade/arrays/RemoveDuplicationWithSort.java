package computrade.arrays;

import java.util.Arrays;

public class RemoveDuplicationWithSort {

    /*
     * Method to remove duplicates from array in Java, without using
     * Collection classes e.g. Set or ArrayList. 
     * Algorithm for this method is first sort the array and then compare adjacent
     * objects, .
     */
    public int[] removeDuplicates(int[] numbersWithDuplicates) {
    	
    	System.out.println("Array with Duplicates: " + Arrays.toString(numbersWithDuplicates));
        // Sorting array to bring duplicates together      
        Arrays.sort(numbersWithDuplicates);     
      
        int[] result = new int[numbersWithDuplicates.length];
        int previous = numbersWithDuplicates[0];
        result[0] = previous;
        int resultcounter=1;

        for (int i = 1; i < numbersWithDuplicates.length; i++) {
            int nextInt = numbersWithDuplicates[i];
            if (previous != nextInt) {
                result[i] = nextInt;
                resultcounter++;
            }
            previous = nextInt;
        }
        
        //create result array only once.
        int[] resultWIthoutDuplicate = new int[resultcounter];
        
        for (int i=0,j=0; i<result.length; i++) {
        	if(result[i]!=0){
        		resultWIthoutDuplicate[j++]=result[i];
        	}
        }
        
        System.out.println("Array without Duplicates: " + Arrays.toString(resultWIthoutDuplicate));
        return resultWIthoutDuplicate;

    }
}

