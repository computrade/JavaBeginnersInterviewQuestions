package inheritance.start;

public class Blue extends Color {
	
	private int transparency;
	
	public Blue(){
		System.out.println("Printed from Blue constructor" );
	}
	
	@Override
	public void fill() {
		System.out.println("Inside Blue::fill() method.");
	}
	
	@Override
	public void setTransparency(int transparency){
		this.transparency = transparency*2;
		System.out.println("The setTransparency set to: " + this.transparency);
	}
	
}
