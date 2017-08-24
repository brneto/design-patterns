package simuduck.client;

import simuduck.behavior.Quackable;
import simuduck.observable.helper.Observable;
import simuduck.observer.Observer;

public class RedheadDuck implements Quackable {
	Observable observable;
	
	public RedheadDuck() {
		observable = new Observable(this);
	}
	
	@Override
	public void quack() {
		System.out.println("Quack");
		notifyObservers();
	}

	@Override
	public void registerObserver(Observer observer) {
		observable.registerObserver(observer);
	}

	@Override
	public void notifyObservers() {
		observable.notifyObservers();
	}
	
	@Override
	public String toString() {
		return "Redhead Duck";
	}

}
