package simuduck;
import simuduck.behavior.fly.FlyRocketPowered;
import simuduck.behavior.fly.FlyWithWings;
import simuduck.behavior.quack.MuteQuack;
import simuduck.behavior.quack.Quack;
import simuduck.client.Duck;
import simuduck.client.type.MallardDuck;
import simuduck.client.type.ModelDuck;


/**
 * The Strategy Pattern:
 * 
 * Defines a family of algorithms (FlyBehavior and QuackBehavior),
 * encapsulates each one, and makes them interchangeable.
 * Strategy lets the algorithms vary independently from clients
 * that use it.
 */
public class DuckSimulator {

	public static void main(String[] args) {
		DuckSimulator simulator = new DuckSimulator();
		Duck mallard = new MallardDuck();
		Duck model = new ModelDuck();
				
		mallard.setFlyBehavior(new FlyWithWings());
		mallard.setQuackBehavior(new Quack());
		
		model.setFlyBehavior(new FlyRocketPowered());
		model.setQuackBehavior(new MuteQuack());
		
		simulator.perform(mallard);
		System.out.println("");
		simulator.perform(model);
	}
	
	public void perform(Duck duck) {
		duck.display();
		duck.quack();
		duck.swim();
		duck.fly();
	}

}
