package inheritance.end;

public class Blue extends Color {
	
	public Blue(){
		System.out.println("Printed from Blue constructor" );
	}
	
	@Override
	public void fill() {
		System.out.println("Inside Blue::fill() method.");
	}
	
	public static void myStaticMethod() {
		
		System.out.println("Printed from Blue.myStaticMethod");
		
	}
	

}
