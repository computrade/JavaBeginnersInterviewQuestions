package inheritance.start;

public class Blue extends Color {
	@Override
	public void fill() {
		System.out.println("Inside Blue::fill() method.");
	}
	
	public static void myStatic() {
		System.out.println("Inside Blue::Blue.myStatic() method.");
	}
	
	public static void myStaticMethod() {
		
		System.out.println("Printed from Blue.myStaticMethod");
		
	}
	

}
