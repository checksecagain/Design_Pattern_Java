package com.main.singelton;

public class StaticBlockSingelton {
	
	private static StaticBlockSingelton instance;
	
	private StaticBlockSingelton() {}
	
	// Initializing instance variable at time of class loading through static block along with exceptional handling.
	static {
		try {
			instance = new StaticBlockSingelton();
		} catch (Exception e) {
			System.out.println("Exception in creating singelton");
		}
	}
	
	// Accessing instance variable from outside.
	public static StaticBlockSingelton getInstance() {
		return instance;
	}
	
}
