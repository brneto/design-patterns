package weatherdata;

public class WeatherData {
	
	public float getTemperature() {
		return 27;
	}
	
	public float getHumidity() {
		return 70;
	}
	
	public float getPressure() {
		return 5;
	}
	
	public void measurementsChanged() {
		float temp = getTemperature();
		float humidity = getHumidity();
		float pressure = getPressure();
		
		
	}

}
