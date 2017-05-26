package Singleton;

public class DoubleCheckedLockingSingletonDemo {
	
public static void main(String[] args) { 
		
		//illegal construct 
		//Compile Time Error: The constructor SingleObject() is not visible 
		//DoubleCheckedLockingSingleton object = new DoubleCheckedLockingSingleton();
		
		//Get the only object available
		DoubleCheckedLockingSingleton object = DoubleCheckedLockingSingleton.getInstance(); 
		
		//show the message
		
		object.showMessage(); 
		}
		

}
