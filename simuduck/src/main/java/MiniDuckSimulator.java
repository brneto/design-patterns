import simuduck.Duck;
import simuduck.ducktype.MallardDuck;
import simuduck.ducktype.ModelDuck;
import simuduck.flybehavior.FlyRocketPowered;
import simuduck.flybehavior.FlyWithWings;
import simuduck.quackbehavior.MuteQuack;
import simuduck.quackbehavior.Quack;

public class MiniDuckSimulator {
	private Duck mallard;
	private Duck model;

	public MiniDuckSimulator() {
		mallard = new MallardDuck();		
		mallard.setFlyBehavior(new FlyWithWings());
		mallard.setQuackBehavior(new Quack());
		
		model = new ModelDuck();
		model.setFlyBehavior(new FlyRocketPowered());
		model.setQuackBehavior(new MuteQuack());
	}

	public static void main(String[] args) {
		MiniDuckSimulator simulator = new MiniDuckSimulator();
		
		simulator.perform(duck);
	}
	
	public void perform(Duck duck) {
		duck.display();
		duck.quack();
		duck.swim();
		duck.fly();
	}

}
