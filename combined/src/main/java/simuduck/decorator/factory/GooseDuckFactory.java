package simuduck.decorator.factory;

import simuduck.adapter.GooseAdapter;
import simuduck.behavior.Quackable;
import simuduck.client.Goose;
import simuduck.factory.DuckFactory;

public class GooseDuckFactory extends AbstractGooseDuckFactory {
	
	public GooseDuckFactory(DuckFactory duckFactory) {
		super(duckFactory);
	}
	
	public Quackable createGooseDuck() {
		return new GooseAdapter(new Goose());
	}

}
