package simuduck.adapter;

import simuduck.behavior.Quackable;
import simuduck.client.Goose;
import simuduck.observable.helper.Observable;
import simuduck.observer.Observer;

public class GooseAdapter implements Quackable {
	Goose goose;
	Observable observable;
	
	public GooseAdapter(Goose goose) {
		this.goose = goose;
		observable = new Observable(this);
	}

	@Override
	public void quack() {
		goose.honk();
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
		return goose + " pretending to be a Duck";
	}

}
