package main.behavior.strategy;

public class Main {

	public static void main(String[] args) {

		Cart shoppingCart = new Cart();
		
		Item shoe = new Item("Addi", 100);
		Item football = new Item("Football", 200);
		
		shoppingCart.addItem(shoe);
		shoppingCart.addItem(football);
		shoppingCart.removeItem(football);
		
		shoppingCart.pay(new Cash(), 99);		
		shoppingCart.pay(new Card(), 1);
		shoppingCart.pay(new Card(), 200);
		
		if (shoppingCart.getTransactionStatus()) {
			System.out.println("Transaction Completed Successfully");
		} else {
			System.out.println("Transaction in Progress");
		}
		
	}

}
