// Note: This method is better then all the previous ones because it is not using synchronized and also thread-safe as inter class only loaded into memory when someone called the getInstance method.


package main.singleton;

public class BillPughSingleton {
	
	private BillPughSingleton() {}
	
	private static class SingeltonHelper {
		private static final BillPughSingleton INSTANCE = new BillPughSingleton();
	}

	public static BillPughSingleton getInstance() {
		return SingeltonHelper.INSTANCE;
	}
}
