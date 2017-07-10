package weatherdata.ui.type;

import java.util.Locale;
import java.util.Observable;
import java.util.Observer;

import weatherdata.WeatherData;
import weatherdata.ui.DisplayElement;

public class StatisticsDisplay implements Observer, DisplayElement {
	float maxTemp, minTemp, avgTemp;
	
	@Override
	public void update(Observable o, Object arg) {
		if (o instanceof WeatherData) {
			WeatherData weatherData = (WeatherData) o;
			float temp = weatherData.getTemperature();
			
			if (maxTemp <= temp ) {
				minTemp = maxTemp == 0 ? temp : maxTemp;
				maxTemp = temp;
			} else {
				minTemp=temp;
			}
			
			display();
		}
	}
	
	@Override
	public void display() {
		// Display the average, min and max measurements
		System.out.println(String.format(Locale.US,"Avg/Max/Min temperature = %.1f/%.1f/%.1f",
				(maxTemp + minTemp)/2, maxTemp, minTemp));
	}

}
