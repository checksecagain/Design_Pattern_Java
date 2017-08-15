package main.singelton;

public class Main {

	public static void main(String[] args) {
		
		EagerInitializationSingelton instance = EagerInitializationSingelton.getInstance();
		System.out.println(instance.hashCode());
		
		instance = EagerInitializationSingelton.getInstance();
		System.out.println(instance.hashCode());
		
		//StaticBlockSigelton instance2 = new StaticBlockSigelton();
		
	}

}
