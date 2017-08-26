package main.creational.factory;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner userInput = new Scanner(System.in);
		EnemyShipFactory enemyShipFactory = new EnemyShipFactory();
		
		while(userInput.hasNextLine()) {
			
			String typeOfShip = userInput.nextLine();
			
			doStuffEnemy(enemyShipFactory.getEnemyShip(typeOfShip));
		}
		
		userInput.close();
		
	}

	public static void doStuffEnemy(EnemyShip anEnemyShip) {
		if (anEnemyShip == null) return;
		anEnemyShip.displayEnemyShip();
		anEnemyShip.followHeroShip();
		anEnemyShip.enemyShipShoots();
	}
}
