package inheritance.end;

public class Main {
	
	public static void main(String [] args){
		
	
		Color blue = new Blue();
		blue.fill();
		blue.setCode();
		
		Color green = new Green();
		green.fill();
		green.setCode();
		
		Color red = new Red();
		red.fill();
		red.setCode();
		red.setTransparency(100);
		//red.myStaticMethod();

	}

}
