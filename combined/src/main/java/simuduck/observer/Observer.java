package simuduck.observer;

import simuduck.observable.QuackObservable;

public interface Observer {
	public void update(QuackObservable duck);
}
