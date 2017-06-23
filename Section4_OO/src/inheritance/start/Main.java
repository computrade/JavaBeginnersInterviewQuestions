package inheritance.start;

public class Main {
	
	public static void main(String [] args){
		
		Color color = new Color();
		color.fill();
	
		ColorI blue = new Blue();
		blue.fill();
		blue.setCode("#0000FF");
		
		ColorI green = new Green();
		green.fill();
		green.setCode("#00FF00");
		
		ColorI red = new Red();
		red.fill();
		red.setCode("#FF0000");
				
	}

}
