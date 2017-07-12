package inheritance.end;

public abstract class Color implements ColorI{
	
	private String code;
	private int transparency;
	
	public Color(){
		System.out.println("Printed from Color constructor" );
	}
	
	@Override
	public void fill() {
		System.out.println("Inside Color::fill() method.");
	}
	
	abstract void setCode();
	
	@Override
	public void setCode(String code) {
		this.code = code;
		System.out.println("Inside Color::setCode() to:" + code);
	}
	
	@Override
	public void setTransparency(int transparency){
		this.transparency = transparency;
		System.out.println("The setTransparency set to: " + transparency);
	}
	
	public static void myStaticMethod() {
		
		System.out.println("Printed from Color.myStaticMethod");
		
	}
	
}
