// Note: This method reduce the overhead as synchronized block is only called for first few threads that are accessing the class at the same time.

package main.singelton;

public class ThreadSafeDoubleLockingCheckSingelton {

	private static ThreadSafeDoubleLockingCheckSingelton instance;
	
	private ThreadSafeDoubleLockingCheckSingelton() {}
	
	public static ThreadSafeDoubleLockingCheckSingelton getInstance() {
		if (instance == null) {
			synchronized(ThreadSafeDoubleLockingCheckSingelton.class) {
				instance = new ThreadSafeDoubleLockingCheckSingelton();
			}
		}
		
		return instance;
	}
	
}
