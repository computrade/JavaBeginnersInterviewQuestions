package Singleton;

/* 3rd version : An implementation of double checked locking of Singleton. 
 * Intention is to minimize cost of synchronization and improve performance,
 * by only locking critical section of code, the code which creates instance of Singleton class.
 * By the way this is still broken, if we don't make _instance volatile, as another thread can 
 * see a half initialized instance of Singleton.
 */

public class DoubleCheckedLockingSingleton {

	private volatile static DoubleCheckedLockingSingleton INSTANCE;

	private DoubleCheckedLockingSingleton() {
	} // preventing Singleton object instantiation from outside }

	public static DoubleCheckedLockingSingleton getInstance() {
		if (INSTANCE == null) {
			synchronized (DoubleCheckedLockingSingleton.class) {
				// double checking Singleton instance
				if (INSTANCE == null) {
					INSTANCE = new DoubleCheckedLockingSingleton();
				}
			}
		}
		return INSTANCE;
	}

	public void showMessage() {
		System.out.println("Hello World from DoubleCheckedLockingSingleton!");
	}

}
