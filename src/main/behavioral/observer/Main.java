package main.behavioral.observer;

public class Main {

	public static void main(String[] args) {
		WeatherStation weatherStation = new WeatherStation();
		weatherStation.setTemperature(10.2f);
		
		Mobile mobile = new Mobile(weatherStation);
		weatherStation.addObserver(mobile);
		
		weatherStation.setTemperature(100.0f);
	}
	
}
