// Note: This method doesn't provide any option for exception handling.

package com.main.singelton;

public class EagerInitializationSingelton {
	
	// This will create a new instance of the class when the class in being loaded.
	private static final EagerInitializationSingelton instance = new EagerInitializationSingelton();
	
	// Making constructor private so it cannot accessible from outside the class
	private EagerInitializationSingelton() {};
	
	// Return the instance of the class
	public static EagerInitializationSingelton getInstance() {
		return instance;
	}
}
