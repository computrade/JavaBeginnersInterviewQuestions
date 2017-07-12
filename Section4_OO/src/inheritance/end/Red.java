package inheritance.end;

public class Red extends Color {
	
	private int transparency;
	
	public Red(){
		System.out.println("Printed from Red constructor");	
	}
	
	@Override
	public void fill() {
		System.out.println("Inside Red::fill() method.");
	}
	
	@Override
	public void setTransparency(int transparency){
		this.transparency = transparency*2;
		System.out.println("The setTransparency set to: " + this.transparency);
	}

	public static void myStaticMethod() {
		
		System.out.println("Printed from Red.myStaticMethod");
		
	}
	
	@Override
	void setCode() {
		super.setCode("#FF0000");
		
	}
	
}
