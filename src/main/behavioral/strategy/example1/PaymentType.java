package main.behavioral.strategy.example1;

public interface PaymentType {
	
	public Boolean pay(float newAmount);
	
}

class Card implements PaymentType {
	
	public float amount;
	
	public Boolean pay(float newAmount) {
		amount 	= newAmount;
		System.out.println("Paid with card " + amount);
		return true;
	}
}

class Cash implements PaymentType {
	
	public float amount;
	
	public Boolean pay(float newAmount) {
		amount 	= newAmount;
		System.out.println("Paid with cash " + amount);
		return true;
	}
	
}
