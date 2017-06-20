package inheritance.start;

public class Color implements ColorI{
	
	private String code;
	
	public Color(){
		//System.out.println("Printed from Color constructor" );
	}

	@Override
	public void fill() {
		
		System.out.println("Inside Color::fill() method.");
		
	}


	@Override
	public void setCode(String code) {
		this.code = code;
		System.out.println("Inside Color::setCode() to:" + code);
		
		
	}
	
}
