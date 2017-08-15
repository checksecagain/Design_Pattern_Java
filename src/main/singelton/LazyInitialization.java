// Note: This method is not thread-safe as if multiple threads access the method at the same time then it will create multiple instance of the same class

package main.singelton;

public class LazyInitialization {

	private static LazyInitialization instance;
	
	private LazyInitialization() {}
	
	public static LazyInitialization getInstance() {
		if (instance == null) {
			instance = new LazyInitialization();
		}
		return instance;
	}
}
