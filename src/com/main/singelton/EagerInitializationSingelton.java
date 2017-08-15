// Note: This method doesn't provide any option for exception handling.

package com.main.singelton;

public class EagerInitializationSingelton {
	
	// This will create a new instance of the class when the class in being loaded.
	private static final EagerInitializationSingelton instance = new EagerInitializationSingelton();
	
	// Making constructor private so it cannot accessible from outside the class
	private EagerInitializationSingelton() {
		
		// If constructor in access using reflection then this condition don't allow it to create new object.
		if (instance != null) {
	        throw new IllegalStateException( "Creating of this object is not allowed." );
		}
	};
	
	// Return the instance of the class
	public static EagerInitializationSingelton getInstance() {
		return instance;
	}
}
