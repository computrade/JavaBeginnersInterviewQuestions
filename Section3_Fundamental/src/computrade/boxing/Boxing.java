package computrade.boxing;

import java.util.ArrayList;
import java.util.List;

public class Boxing {
	
	public static void main(String[] args) {
		
        //Here is the simplest example of autoboxing from int to Integer.
		Integer myNumber = 8;  // Auto-Boxing through assignment
		unBoxingTroughMethodInvocation();
        //autoBoxingWithList();
        //sumEven();
        
    }


	private static void unBoxingTroughMethodInvocation() {
		// 1. Unboxing through method invocation
        int absVal = absoluteValue(new Integer(-8));
        System.out.println("absolute value of -8 is= " + absVal);
	}
	
    public static int absoluteValue(int i) {
    	System.out.println("inside absoluteValue(int i)");
        return (i < 0) ? -i : i;
    }
       
	private static void autoBoxingWithList() {
		List<Double> ld = new ArrayList<Double>();
        double pi = 3.1416;
        ld.add(pi);    // pi is autoboxed through method invocation.

        
        pi = ld.get(0); // Unboxing through assignment
        System.out.println("pi = " + pi);
	}

	public static List<Integer> addIntToList() {

		List<Integer> li = new ArrayList<Integer>();
		for (int i = 1; i < 50; i++) {
			li.add(i); // autoboxing - compiler convert the code into - li.add(Integer.valueOf(i));
		}
		
		return li;

	}

	
	public static int sumEven() {
		
		List<Integer> li = addIntToList(); 
		int sum = 0;
		for (Integer i : li){
			// The compiler does not generate an error because it invokes the i.intValue() method. 
			if (i % 2 == 0){
				sum += i;  
			}	
		}
		
		System.out.println("sum of Even is = " + sum);
		
		return sum;
	}
	
	
    public static int absoluteValue(Integer i) {
    	System.out.println("inside absoluteValue(Integer i)");
        return (i < 0) ? -i : i;
    }
    
	

}
