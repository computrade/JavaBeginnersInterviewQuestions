package computrade.gc;

public class Main {
	
	public static void main(String []args){
		
		Main mainClass = new Main();
		mainClass.checkGCinAction();
		
		//Activating the GC, so we can see that finalize method was executed.
		System.gc(); 
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Finishing Main");
	}
	
	private void checkGCinAction(){
		
		MyTestClassForGC myTestClassForGC = new MyTestClassForGC();
		// After finishing this method the "myTestClassForGC" instance has no reference - it can be GC.
		myTestClassForGC.doingSomething();
		
	}

}
