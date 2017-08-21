package simuduck;

import simuduck.adapter.GooseAdapter;
import simuduck.behavior.Quackable;
import simuduck.client.DuckCall;
import simuduck.client.Goose;
import simuduck.client.MallardDuck;
import simuduck.client.RedheadDuck;
import simuduck.client.RubberDuck;

public class DuckSimulator {

	public static void main(String[] args) {
		DuckSimulator simulator = new DuckSimulator();
		simulator.simulate();
	}

	void simulate() {
		Quackable mallardDuck = new MallardDuck();
		Quackable redheadDuck = new RedheadDuck();
		Quackable duckCall = new DuckCall();
		Quackable rubberDuck = new RubberDuck();
		Quackable gooseDuck = new GooseAdapter(new Goose());

		System.out.println("\nDuck Simulator: With goose Adapter");

		simulate(mallardDuck);
		simulate(redheadDuck);
		simulate(duckCall);
		simulate(rubberDuck);
		simulate(gooseDuck);
	}

	void simulate(Quackable duck) {
		duck.quack();
	}

}
