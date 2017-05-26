package Inhertance;

public class Color implements ColorI{
	
	public int num = 1;
	
	public Color(){
		System.out.println("Printed from Color const. num is:"  + num);
	}

	@Override
	public void fill() {
		
		System.out.println("Printed from Color");
		
	}
	
	

}
