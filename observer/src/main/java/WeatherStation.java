import weatherdata.WeatherData;
import weatherdata.ui.CurrentConditionsDisplay;
import weatherdata.ui.ForecastDisplay;
import weatherdata.ui.HeatIndexDisplay;
import weatherdata.ui.StatisticsDisplay;

public class WeatherStation {

	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		
		CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay();
		StatisticsDisplay statisticsDisplay = new StatisticsDisplay();
		ForecastDisplay forecastDisplay = new ForecastDisplay();
		HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay();
		
		weatherData.addObserver(heatIndexDisplay);
		weatherData.addObserver(forecastDisplay);
		weatherData.addObserver(statisticsDisplay);
		weatherData.addObserver(currentDisplay);
		
		weatherData.setMeasurements(80, 65, 30.4f);
		weatherData.setMeasurements(82, 70, 29.2f);
		weatherData.setMeasurements(78, 90, 29.2f);
	}

}
