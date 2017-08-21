package simuduck;

import simuduck.adapter.GooseAdapter;
import simuduck.behavior.Quackable;
import simuduck.client.Goose;
import simuduck.decorator.QuackCounter;
import simuduck.factory.AbstractDuckFactory;
import simuduck.factory.CountingDuckFactory;

public class DuckSimulator {

	public static void main(String[] args) {
		DuckSimulator simulator = new DuckSimulator();
		AbstractDuckFactory duckFactory = new CountingDuckFactory();
		
		simulator.simulate(duckFactory);
	}

	void simulate(AbstractDuckFactory duckFactory) {
		Quackable mallardDuck = duckFactory.createMallardDuck();
		Quackable redheadDuck = duckFactory.createRedheadDuck();
		Quackable duckCall = duckFactory.createDuckCall();
		Quackable rubberDuck = duckFactory.createRubberDuck();
		Quackable gooseDuck = new GooseAdapter(new Goose());

		System.out.println("\nDuck Simulator: With Adapter, Decorator and Abstract Factory");

		simulate(mallardDuck);
		simulate(redheadDuck);
		simulate(duckCall);
		simulate(rubberDuck);
		simulate(gooseDuck);
		
		System.out.println(QuackCounter.getQuacks() + " quacks were counted");
	}

	void simulate(Quackable duck) {
		duck.quack();
	}

}
