package inheritance.end;

public class Main {
	
	public static void main(String [] args){
		
		Color color = new Green();
		color.fill();
		
		color = new Blue();
		color.fill();
		color.myStaticMethod();
		color.myFinalMethod();
	}

}
