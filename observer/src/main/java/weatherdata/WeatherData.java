package weatherdata;

import weatherdata.subject.WeatherSubject;

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
		WeatherSubject subject = new WeatherSubject();
		subject.notifyObservers();
	}

}
