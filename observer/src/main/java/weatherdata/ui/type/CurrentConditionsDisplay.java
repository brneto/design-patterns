package weatherdata.ui.type;

import java.util.Observable;
import java.util.Observer;

import weatherdata.WeatherData;
import weatherdata.ui.DisplayElement;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
	float temperature, humidity;
	
	@Override
	public void update(Observable o, Object arg) {
		if (o instanceof WeatherData) {
			WeatherData weatherData = (WeatherData) o;
			this.temperature = weatherData.getTemperature();
			this.humidity = weatherData.getHumidity();
			display();
		}
	}
	
	@Override
	public void display() {
		// Display current measurements
		System.out.println("Current conditions: " + temperature
				+ "F degrees and " + humidity + "% humidity");
	}
}
