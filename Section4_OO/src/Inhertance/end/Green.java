package Inhertance.end;

public class Green extends Color {
	
	public int num = 2;
	public Green(){
		System.out.println("Printed from Green const. num is:" + num);
		
	}
	
	
	@Override
	public void fill() {
		System.out.println("Inside Green::fill() method.");
	}
}
