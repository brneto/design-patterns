package objectvillemenus.composite.iterator;

import java.util.Iterator;

import objectvillemenus.component.MenuComponent;

public class NullIterator implements Iterator<MenuComponent> {

	public NullIterator() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public MenuComponent next() {
		// TODO Auto-generated method stub
		return null;
	}

}
