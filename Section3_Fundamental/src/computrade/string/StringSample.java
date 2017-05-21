package computrade.string;

public class StringSample {
	
	public static void main(String args[]){
		
		StringSample stringSample = new StringSample();
		stringSample.areStringEquals();		
	}
	private void areStringEquals(){
		
		String first = "myTestString"; // created in the String Pool
		String second = "myTestString";
		String third = new String("myTestString"); // created in the heap.
		String fourth = new String("myTestString");// created in the heap.
		
		//System.out.println("Is first is the same as second string? " + (first == second)); //true
        //System.out.println("Is first is the same as \"myTestString\" string? " + (first == "myTestString")); // true
        //System.out.println("Is second is the same as string from Other Class? " + (Other.stringFromOtherClass == second)); //true
        //System.out.println("Is second is the same as string that I'm concatenating? " 
        //		+ (second == ("my"+"Test" + "String")) + " "); // true
		
        System.out.println("Is first is the same as third string? " + (first == third)); //false
        //System.out.println("Is third is the same as fourth string? " + (third == fourth)); //false
        
        // String are equals but they are not the same object in memory!
		boolean isEquals = first.equals(third); //true
		System.out.println("Is first is equals to the third string? " + isEquals); 
		
		//String hasCode is the same but they are not the same object in memory!
		System.out.println("The first String hashCode is: " + first.hashCode()); 
		System.out.println("The second String hashCode is: " + second.hashCode()); 
		System.out.println("The third String hashCode is: " + third.hashCode()); 
	
		
	}

}


