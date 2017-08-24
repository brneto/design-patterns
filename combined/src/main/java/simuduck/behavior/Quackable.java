package simuduck.behavior;

import simuduck.observable.QuackObservable;

public interface Quackable extends QuackObservable {
	public void quack();
}
