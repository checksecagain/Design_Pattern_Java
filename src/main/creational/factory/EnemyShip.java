package main.creational.factory;

public abstract class EnemyShip {
	private String name;
	private float damage;
	
	public void setName(String newName) { name = newName; }
	public String getName() { return name; }
	
	public void setDamage(float damage) { this.damage = damage; }
	public float getDamage() { return damage; }
	

	public void followHeroShip() {
		System.out.println(getName() + " is following the hero");
	}
	
	public void displayEnemyShip() {
		System.out.println(getName() + " is on the screen"); 
	}
	
	public void enemyShipShoots() {
		System.out.println(getName() + " attacks and does " + getDamage() + " damage");
	}
}
