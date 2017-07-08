import simuduck.Duck;
import simuduck.ducktype.MallardDuck;
import simuduck.ducktype.ModelDuck;
import simuduck.flybehavior.FlyRocketPowered;
import simuduck.flybehavior.FlyWithWings;
import simuduck.quackbehavior.MuteQuack;
import simuduck.quackbehavior.Quack;

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
