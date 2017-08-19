package main.behavior.strategy;

import java.util.ArrayList;
import java.util.List;

public class Cart {

	private List<Item> items;
	private float amountPaid;
	
	Cart() {
		items = new ArrayList<Item>();
	}
	
	public void addItem(Item newItem) {
		items.add(newItem);
	}
	
	public void removeItem(Item newItem) {
		items.remove(newItem);
	}
	
	public float getCartTotal() {
		float sum = 0;
		for (Item item : items) {
			sum += item.getPrice();
		}
		return sum;
	}
	
	public Boolean getTransactionStatus() {
		if ((getCartTotal() - amountPaid) == 0) return true; else return false;
	}
	
	public void pay(PaymentType type, float amount) {
		float amountLeft = getCartTotal() - amountPaid;
		if (amountLeft > 0 && amount <= amountLeft) {
			if(type.pay(amount))
				amountPaid += amount; 
			else
				System.out.println("Payment failed: " + type.getClass().getName());
		} else {
			System.out.println("Unable to process payment: Amount left to pay=" + amountLeft + " amount paid:" + amount);
		}
	}
}
