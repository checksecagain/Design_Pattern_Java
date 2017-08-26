package main.creational.factory;

public class EnemyShipFactory {

	public EnemyShip getEnemyShip(String name) {
		if (name.equalsIgnoreCase("S")) return new SmallEnemyShip();
		else if (name.equalsIgnoreCase("R")) return new RocketEnemyShip();
		else if (name.equalsIgnoreCase("B")) return new BigEnemyShip();
		return null;
	}
	
}
