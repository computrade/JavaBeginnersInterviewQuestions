package Singleton;

////Enum is thread safe and implementation of Singleton through Enum ensures that your singleton will have only
//one instance even in a multithreaded environment.

public enum EasySingleton {

	INSTANSE;
	
	public void doStuff(){
		
		System.out.println("Singleton using Enum");
		
		}
		
		
	
}
