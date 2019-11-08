package simuduck.adaptor;

import simuduck.adaptee.type.Turkey;
import simuduck.target.type.Duck;

public class TurkeyAdapter implements Duck {
	final private Turkey turkey;

	public TurkeyAdapter(Turkey turkey) {
		this.turkey = turkey;
	}

	@Override
	public void quack() {
		turkey.gobble();
	}

	@Override
	public void fly() {
		for(int i=0; i < 5; i++) {
			turkey.fly();
		}
	}

}
