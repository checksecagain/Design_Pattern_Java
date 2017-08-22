package main.behavioral.strategy.example2;

public interface DisplayBehaviour {
	public void display();
}

class CLIDisplay implements DisplayBehaviour {
	public void display() {
		System.out.println("[D] CLI");
	}
}

class GUIDisplay implements DisplayBehaviour {
	public void display() {
		System.out.println("[D] GUI");
	}
}
