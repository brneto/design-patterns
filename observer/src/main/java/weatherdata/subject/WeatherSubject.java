package weatherdata.subject;

import java.util.ArrayList;
import java.util.Collection;

import weatherdata.observer.Observer;

public class WeatherSubject implements Subject {
	Collection<Observer> observers;
	
	public WeatherSubject() {
		observers = new ArrayList<Observer>();
	}
	
	@Override
	public void registerObserver(Observer observer) {
		observers.add(observer);
	}
	
	@Override
	public void removeObserver(Observer observer) {
		observers.remove(observer);
	}
	
	@Override
	public void notifyObservers() {
		for (Observer observer : observers)
			observer.update();
	}

}
