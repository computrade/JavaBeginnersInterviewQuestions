package Inhertance.start;

public class Color implements ColorI{
	
	public int num = 1;
	
	public Color(){
		System.out.println("Printed from Color const. num is:"  + num);
	}

	@Override
	public void fill() {
		
		System.out.println("Printed from Color");
		
	}
	
	public static void myStaticMethod() {
		
		System.out.println("Printed from Color.myStaticMethod");
		
	}
	
	public final void myFinalMethod() {
		
		System.out.println("Printed from Color.myFinalMethod");
		
	}
	

}
