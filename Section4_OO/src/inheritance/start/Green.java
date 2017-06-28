package inheritance.start;

public class Green extends Color {
	
	private int transparency;
	
	public Green(){
		System.out.println("Printed from Green constructor");	
	}
	
	@Override
	public void fill() {
		System.out.println("Inside Green::fill() method.");
	}
	
	@Override
	public void setTransparency(int transparency){
		this.transparency = transparency*2;
		System.out.println("The setTransparency set to: " + this.transparency);
	}
}
