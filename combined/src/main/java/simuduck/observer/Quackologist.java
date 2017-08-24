package simuduck.observer;

import simuduck.observable.QuackObservable;

public class Quackologist implements Observer {

	@Override
	public void update(QuackObservable duck) {
		System.out.println("Quackologist: " + duck + " just quacked.");
	}

}
