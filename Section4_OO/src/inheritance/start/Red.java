package inheritance.start;

public class Red extends Color {
	
	public Red(){
		System.out.println("Printed from Red constructor");	
	}
	
	@Override
	public void fill() {
		System.out.println("Inside Red::fill() method.");
	}

}
