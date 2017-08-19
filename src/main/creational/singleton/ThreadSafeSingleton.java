// Note: This method provides thread safety but it reduces the performance because of the cost associated with the synchronized method.
package main.creational.singleton;

public class ThreadSafeSingleton {
	public static ThreadSafeSingleton instance;
	
	private ThreadSafeSingleton() {}
	 
	// Making accessor method thread-safe
	public static synchronized ThreadSafeSingleton getInstance() {
		if (instance == null) {
			instance = new ThreadSafeSingleton();
		}
		return instance;
	}
}
