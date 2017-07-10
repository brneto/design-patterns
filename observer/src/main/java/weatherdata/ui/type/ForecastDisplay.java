package weatherdata.ui.type;

import java.util.Observable;
import java.util.Observer;

import weatherdata.WeatherData;
import weatherdata.ui.DisplayElement;

public class ForecastDisplay implements Observer, DisplayElement {
	private float currentPressure = 29.92f;
	private float lastPressure;
	
	@Override
	public void update(Observable o, Object arg) {
		if (o instanceof WeatherData) {
			WeatherData weatherData = (WeatherData) o;
			lastPressure = currentPressure;
			this.currentPressure = weatherData.getPressure();
			display();
		}
	}
	
	@Override
	public void display() {
		// Display the forecast
		if (currentPressure == lastPressure) {
			System.out.println("Forecast: More of the same");
		} else if (currentPressure >= 30f) {
			System.out.println("Forecast: Improving weather on the way!");
		} else if (currentPressure < 30f) {
			System.out.println("Forecast: Watch out for cooler, rainy weather");
		}
	}
}
