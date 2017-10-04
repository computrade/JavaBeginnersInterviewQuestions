package computrade.arrays;

import java.util.Arrays;

public class RemoveDuplication {

    public int[] removeDuplicates(int[] numbersWithDuplicates){
    	
    	System.out.println("Array with Duplicates: " + Arrays.toString(numbersWithDuplicates));
        int end = numbersWithDuplicates.length;
        boolean resultBoolean[] = new boolean[numbersWithDuplicates.length];
       
        for (int i = 0; i < end; i++) {
            for (int j = i + 1; j < end; j++) {
                if (numbersWithDuplicates[i] == numbersWithDuplicates[j]) {                  
                    resultBoolean[j]=true;
                }
            }
        }
        
        //count the results.
        int resultCounter=0;
        for (boolean duplicate: resultBoolean){
        	if(!duplicate) resultCounter++;  
        }
        
        //create the result array with the correct size only once.
        int[] resultWIthoutDuplicate = new int[resultCounter];
        for (int i=0,j=0; i < numbersWithDuplicates.length; i++) {
        	if(!resultBoolean[i]){
        		resultWIthoutDuplicate[j]=numbersWithDuplicates[i];
        		j++;
        	}  	
        }
        
        System.out.println("Array without Duplicates: " + Arrays.toString(resultWIthoutDuplicate));
        return resultWIthoutDuplicate;
    }

}

