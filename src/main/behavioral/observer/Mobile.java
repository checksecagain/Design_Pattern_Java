package main.behavioral.observer;

public class Mobile implements Observer {

	private float temperature;
	private WeatherStation weatherStation;
	
	Mobile(WeatherStation weatherStation) {
		this.weatherStation = weatherStation;
	}
	
	@Override
	public void update() {
		System.out.println("Mobile:Temperature Changed: " + temperature + " -> " + weatherStation.getTemperature());
		temperature = weatherStation.getTemperature();
	}

}
