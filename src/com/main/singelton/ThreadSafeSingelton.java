// Note: This method provides thread safety but it reduces the performance because of the cost associated with the synchronized method.
package com.main.singelton;

public class ThreadSafeSingelton {
	public static ThreadSafeSingelton instance;
	
	private ThreadSafeSingelton() {}
	 
	// Making accessor method thread-safe
	public static synchronized ThreadSafeSingelton getInstance() {
		if (instance == null) {
			instance = new ThreadSafeSingelton();
		}
		return instance;
	}
}
