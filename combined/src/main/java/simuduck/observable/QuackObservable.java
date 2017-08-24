package simuduck.observable;

import simuduck.observer.Observer;

public interface QuackObservable {
	public void registerObserver(Observer observer);
	public void notifyObservers();
}
