package simuduck.observable.helper;

import java.util.ArrayList;
import java.util.Collection;

import simuduck.observable.QuackObservable;
import simuduck.observer.Observer;

public class Observable implements QuackObservable {
	Collection<Observer> observers = new ArrayList<Observer>();
	QuackObservable duck;
	
	public Observable(QuackObservable duck) {
		this.duck = duck;
	}

	@Override
	public void registerObserver(Observer observer) {
		observers.add(observer);
	}

	@Override
	public void notifyObservers() {
		observers.forEach(e -> e.update(duck));
	}

}
