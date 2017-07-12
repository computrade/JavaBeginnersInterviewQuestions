package inheritance.end;

public class Blue extends Color {
	
	public Blue(){
		System.out.println("Printed from Blue constructor" );
	}
	
	@Override
	public void fill() {
		System.out.println("Inside Blue::fill() method.");
	}
	
	@Override
	void setCode() {
		super.setCode("#0000FF");
		
	}
	

}
