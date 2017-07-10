package weatherdata.ui;

import weatherdata.WeatherData;
import weatherdata.observer.Observer;

public class ForecastDisplay implements Observer {

	public ForecastDisplay() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void update() {
		WeatherData weather = new WeatherData();
		
		float temp = weather.getTemperature();
		float humidity = weather.getHumidity();
		float pressure = weather.getPressure();

	}

}
