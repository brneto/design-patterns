package weatherdata.subscriber;

import java.util.ArrayList;
import java.util.Collection;

import weatherdata.ui.Display;

public class WeatherSubscriber {
	Collection<Display> subscribers;
	
	public WeatherSubscriber() {
		subscribers = new ArrayList<Display>();
	}
	
	public void update(float temp, float humidity, float pressure) {
		for (Display display : subscribers)
			display.update(temp, humidity, pressure);
	}
	
	public void register(Display display) {
		subscribers.add(display);
	}
	
	public void remove(Display display) {
		subscribers.remove(display);
	}

}
