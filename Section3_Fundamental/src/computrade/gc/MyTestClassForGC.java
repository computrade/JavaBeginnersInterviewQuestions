package computrade.gc;

public class MyTestClassForGC {
	
	public MyTestClassForGC(){
		System.out.println("MyTestClassForGC initialized");
		
	}
	
	public void doingSomething()  {
		System.out.println("MyTestClassForGC.doingSomething method.");
	}
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Inside the MyTestClassForGC.finalize method before it is being garbage collected.");
		super.finalize();
	}

}
