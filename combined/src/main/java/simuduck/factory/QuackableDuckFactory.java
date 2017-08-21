package simuduck.factory;

import simuduck.behavior.Quackable;
import simuduck.client.DuckCall;
import simuduck.client.MallardDuck;
import simuduck.client.RedheadDuck;
import simuduck.client.RubberDuck;

public class QuackableDuckFactory implements DuckFactory {

	@Override
	public Quackable createMallardDuck() {
		return new MallardDuck();
	}

	@Override
	public Quackable createRedheadDuck() {
		return new RedheadDuck();
	}

	@Override
	public Quackable createDuckCall() {
		return new DuckCall();
	}

	@Override
	public Quackable createRubberDuck() {
		return new RubberDuck();
	}

}
