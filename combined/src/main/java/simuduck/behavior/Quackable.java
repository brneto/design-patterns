package simuduck.behavior;

import simuduck.observable.QuackObservable;

public interface Quackable extends QuackObservable {
	void quack();
}
