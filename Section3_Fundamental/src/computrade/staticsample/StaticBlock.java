package computrade.staticsample;

import java.util.HashMap;
import java.util.Map;

public class StaticBlock {
	
	  static Map<Double, String> labels = new HashMap<Double, String>();
	    static {
	        labels.put(5.5, "five and a half");
	        labels.put(7.1, "seven point 1");
	    }
	    
	    
	    public static void main(String [] args ){
	    	
	    }
	    
	    

}
