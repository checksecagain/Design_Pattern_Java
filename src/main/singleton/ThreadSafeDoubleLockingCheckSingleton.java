// Note: This method reduce the overhead as synchronized block is only called for first few threads that are accessing the class at the same time.

package main.singleton;

public class ThreadSafeDoubleLockingCheckSingleton {

	private static ThreadSafeDoubleLockingCheckSingleton instance;
	
	private ThreadSafeDoubleLockingCheckSingleton() {}
	
	public static ThreadSafeDoubleLockingCheckSingleton getInstance() {
		if (instance == null) {
			synchronized(ThreadSafeDoubleLockingCheckSingleton.class) {
				instance = new ThreadSafeDoubleLockingCheckSingleton();
			}
		}
		
		return instance;
	}
	
}
