package objectvillemenus.composite.iterator;

import java.util.Iterator;
import java.util.NoSuchElementException;

import objectvillemenus.component.MenuComponent;

public class NullIterator implements Iterator<MenuComponent> {

	@Override
	public boolean hasNext() {
		return false;
	}

	@Override
	public MenuComponent next() {
		throw new NoSuchElementException();
	}

}
