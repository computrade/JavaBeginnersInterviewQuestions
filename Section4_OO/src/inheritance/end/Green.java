package inheritance.end;

public class Green extends Color {
	
	public Green(){
		System.out.println("Printed from Green constructor");	
	}
	
	@Override
	public void fill() {
		System.out.println("Inside Green::fill() method.");
	}
	
	@Override
	void setCode() {
		super.setCode("#00FF00");
		
	}
}
