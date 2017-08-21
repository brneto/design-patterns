package simuduck;

import simuduck.adapter.GooseAdapter;
import simuduck.behavior.Quackable;
import simuduck.client.DuckCall;
import simuduck.client.Goose;
import simuduck.client.MallardDuck;
import simuduck.client.RedheadDuck;
import simuduck.client.RubberDuck;
import simuduck.decorator.QuackCounter;

public class DuckSimulator {

	public static void main(String[] args) {
		DuckSimulator simulator = new DuckSimulator();
		simulator.simulate();
	}

	void simulate() {
		Quackable mallardDuck = new QuackCounter(new MallardDuck());
		Quackable redheadDuck = new QuackCounter(new RedheadDuck());
		Quackable duckCall = new QuackCounter(new DuckCall());
		Quackable rubberDuck = new QuackCounter(new RubberDuck());
		Quackable gooseDuck = new QuackCounter(new GooseAdapter(new Goose()));

		System.out.println("\nDuck Simulator: With Adapter and Decorator");

		simulate(mallardDuck);
		simulate(redheadDuck);
		simulate(duckCall);
		simulate(rubberDuck);
		simulate(gooseDuck);
		
		System.out.println("The ducks quacked " + QuackCounter.getQuacks() + " times");
	}

	void simulate(Quackable duck) {
		duck.quack();
	}

}
