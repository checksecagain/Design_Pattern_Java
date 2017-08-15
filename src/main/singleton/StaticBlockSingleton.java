package main.singleton;

public class StaticBlockSingleton {
	
	private static StaticBlockSingleton instance;
	
	private StaticBlockSingleton() {}
	
	// Initializing instance variable at time of class loading through static block along with exceptional handling.
	static {
		try {
			instance = new StaticBlockSingleton();
		} catch (Exception e) {
			System.out.println("Exception in creating singelton");
		}
	}
	
	// Accessing instance variable from outside.
	public static StaticBlockSingleton getInstance() {
		return instance;
	}
	
}
