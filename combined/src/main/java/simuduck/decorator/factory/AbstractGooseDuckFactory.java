package simuduck.decorator.factory;

import simuduck.behavior.Quackable;
import simuduck.factory.DuckFactory;

public abstract class AbstractGooseDuckFactory implements DuckFactory {
	DuckFactory duckFactory;

	public AbstractGooseDuckFactory(DuckFactory duckFactory) {
		this.duckFactory = duckFactory;
	}

	public abstract Quackable createGooseDuck();

	@Override
	public Quackable createMallardDuck() {
		return duckFactory.createMallardDuck();
	}

	@Override
	public Quackable createRedheadDuck() {
		return duckFactory.createRedheadDuck();
	}

	@Override
	public Quackable createDuckCall() {
		return duckFactory.createDuckCall();
	}

	@Override
	public Quackable createRubberDuck() {
		return duckFactory.createRubberDuck();
	}

}
