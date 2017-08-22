package main.behavioral.strategy.example2;

public interface FlyingBehaviour {
	public void fly();
}

class JetFly implements FlyingBehaviour {
	public void fly() {
		System.out.println("[F] Jet Flying");
	}
}

class NormalFly implements FlyingBehaviour {
	public void fly() {
		System.out.println("[F] Normal Flying");
	}
}