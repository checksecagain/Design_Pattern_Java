package main.behavioral.strategy.example2;

public class Main {

	public static void main(String[] args) {
		Duck duck = new Duck(new JetFly(), new NormalSound(), new CLIDisplay());
		duck.display();
		duck.makeSound();
		duck.fly();
	}

}
