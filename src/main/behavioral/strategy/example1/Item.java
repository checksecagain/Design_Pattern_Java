package main.behavioral.strategy.example1;

public class Item {
	private String name;
	private float price;
	
	Item(String newName, float newPrice) {
		name = newName;
		price = newPrice;
	}
	
	public void setName(String newName) {
		name = newName;
	}
	
	public String getName() {
		return name;
	}
	
	public void setPrice(float newPrice) {
		price = newPrice;
	}
	
	public float getPrice() {
		return price;
	}

}
