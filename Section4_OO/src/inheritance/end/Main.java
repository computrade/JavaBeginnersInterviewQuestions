package inheritance.end;

import inheritance.end.Blue;
import inheritance.end.Color;
import inheritance.end.ColorI;
import inheritance.end.Green;
import inheritance.end.Red;

public class Main {
	
	public static void main(String [] args){
		
		Color color = new Color();
		color.fill();
		color.setCode("");
		
		ColorI blue = new Blue();
		blue.fill();
		blue.setCode("#0000FF");
		
		ColorI green = new Green();
		green.fill();
		green.setCode("#00FF00");
		
		ColorI red = new Red();
		red.fill();
		red.setCode("#FF0000");
		red.setTransparency(100);
		
		//color.myStaticMethod();
		//color.myFinalMethod();
	}

}
