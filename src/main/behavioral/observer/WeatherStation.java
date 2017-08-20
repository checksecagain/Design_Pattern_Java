package main.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Observable {
	
	List<Observer> observers;
	private float temperature;

	WeatherStation() {
		observers = new ArrayList<Observer>();
		
	}
	
	@Override
	public void addObserver(Observer newObserver) {
		observers.add(newObserver);
		
	}

	@Override
	public void removeObserver(Observer observer) {
		observers.remove(observer);
	}

	@Override
	public void notifyObservers() {
		for (Observer o : observers) {
			o.update();
		}
	}
	
	public float getTemperature() {
		return temperature;
	}
	
	public void setTemperature(float newTemperature) {
		temperature = newTemperature;
		notifyObservers();
	}
	
}
