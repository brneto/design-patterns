package simuduck.observer;

import simuduck.observable.QuackObservable;

public interface Observer {
	void update(QuackObservable duck);
}
