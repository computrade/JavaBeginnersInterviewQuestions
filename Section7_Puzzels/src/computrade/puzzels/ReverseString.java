package computrade.puzzels;

public class ReverseString {
	
	// Using Java Api of StringBuilder object.
	public  String reverseJava(String input){
		return new StringBuilder(input).reverse().toString();
	}
	
	// Iterate over the char array of String, using StringBuilder.
	public String reverseStringBuilder(String source) {
	    int i, len = source.length();
	    StringBuilder dest = new StringBuilder(len);

	    for (i = (len - 1); i >= 0; i--){
	        dest.append(source.charAt(i));
	    }

	    return dest.toString();
	}
	
	// Reverse String using char array.
	public String reverseChar(String input){
		
		int begin=0;
	    char[] in = input.toCharArray();
	    //creating the output char array.
	    int len = input.length();
	    char[] out = new char[len];
	    
	    //looping on the input from the end to the beginning
	    for (int end=len-1; end >= 0; end--){
	       out[begin] = in[end];
	       begin++;
	    }
	    
	    return new String(out);
	}
	
	// the most efficient - go only on half of the char.
	public String reverseCharEffective(String input){
	    char[] in = input.toCharArray();
	    int begin=0;
	    int end=in.length-1;
	    char temp;
	    while(end>begin){
	        temp = in[begin];
	        in[begin]=in[end];
	        in[end] = temp;
	        end--;
	        begin++;
	    }
	    return new String(in);
	}
	
	
	
	public String  reverseStringRecursive(String input) {

		if(input.length()<=0){
			return input;
		}
	   return reverse(input, input.length()-1);
	}

	public String reverse(String stringToReverse, int index){
	    if(index == 0){
	        return stringToReverse.charAt(0) + "";
	    }
	    
	    char letter = stringToReverse.charAt(index);
	    return letter + reverse(stringToReverse, index-1);
	}
	
	public String reverseStringRecursiveSecond(String s){
	    if (s.length() == 0) 
	         return s;

	    return reverseStringRecursiveSecond(s.substring(1)) + s.charAt(0);
	}
	
	
	

}
