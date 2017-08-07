package objectvillemenus.composite.iterator;

import java.util.Iterator;
import java.util.Stack;

import objectvillemenus.component.MenuComponent;

public class CompositeIterator implements Iterator<MenuComponent> {
	Stack<Iterable<MenuComponent>> stack = new Stack<Iterable<MenuComponent>>();

	public CompositeIterator(Iterable<MenuComponent> iterable) {
		stack.push(iterable);
	}

	@Override
	public boolean hasNext() {
		
		return false;
	}

	@Override
	public MenuComponent next() {
		// TODO Auto-generated method stub
		return null;
	}

}
