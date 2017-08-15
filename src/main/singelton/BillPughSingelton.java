// Note: This method is better then all the previous ones because it is not using synchronized and also thread-safe as inter class only loaded into memory when someone called the getInstance method.


package main.singelton;

public class BillPughSingelton {
	
	private BillPughSingelton() {}
	
	private static class SingeltonHelper {
		private static final BillPughSingelton INSTANCE = new BillPughSingelton();
	}

	public static BillPughSingelton getInstance() {
		return SingeltonHelper.INSTANCE;
	}
}
