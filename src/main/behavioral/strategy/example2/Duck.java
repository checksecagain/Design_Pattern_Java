package main.behavioral.strategy.example2;

public class Duck {
	FlyingBehaviour flyingBehaviour;
	SoundBehaviour soundBehaviour;
	DisplayBehaviour displayBehaviour;

	Duck(FlyingBehaviour flyingBehaviour, SoundBehaviour soundBehaviour, DisplayBehaviour displayBehaviour) {
		this.flyingBehaviour = flyingBehaviour;
		this.soundBehaviour = soundBehaviour;
		this.displayBehaviour = displayBehaviour;
	}
	
	public void makeSound() {
		this.soundBehaviour.makeSound();
	}
	
	public void display() {
		this.displayBehaviour.display();
	}
	
	public void fly() {
		this.flyingBehaviour.fly();
	}
	
}
