package main.behavioral.observer;

public interface Observable {
	
	public void addObserver(Observer newObserver);
	public void removeObserver(Observer observer);
	public void notifyObservers();

}
