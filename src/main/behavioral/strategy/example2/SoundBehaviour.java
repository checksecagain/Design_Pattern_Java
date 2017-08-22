package main.behavioral.strategy.example2;

public interface SoundBehaviour {
	public void makeSound();
}

class NormalSound implements SoundBehaviour {
	public void makeSound() {
		System.out.println("[S] Making Noraml Sound");
	}
}

class DuckSound implements SoundBehaviour {
	public void makeSound() {
		System.out.println("[S] Making Quck Sound");
	}
}
