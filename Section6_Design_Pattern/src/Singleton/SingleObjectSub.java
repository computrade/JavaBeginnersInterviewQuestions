package Singleton;

public class SingleObjectSub extends SingleObject {

	// create an object of SingleObject - if it was private it wasn't allowed.
	private static SingleObjectSub instance = new SingleObjectSub();

	// make the constructor private so that this class cannot be instantiated


	// Get the only object available
	public static SingleObjectSub getInstance() {
		return instance;
	}

	public void showMessage() {
		System.out.println("Hello World!");
	}

}
