package simuduck.observable;

import simuduck.observer.Observer;

public interface QuackObservable {
	void registerObserver(Observer observer);
	void notifyObservers();
}
