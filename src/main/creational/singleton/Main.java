package main.creational.singleton;

public class Main {

	public static void main(String[] args) {
		
		EagerInitializationSingleton instance = EagerInitializationSingleton.getInstance();
		System.out.println(instance.hashCode());
		
		instance = EagerInitializationSingleton.getInstance();
		System.out.println(instance.hashCode());
		
		//StaticBlockSigelton instance2 = new StaticBlockSigelton();
		
	}

}
