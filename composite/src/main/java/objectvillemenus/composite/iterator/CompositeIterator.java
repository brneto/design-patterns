package objectvillemenus.composite.iterator;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Stack;

import objectvillemenus.component.MenuComponent;

public class CompositeIterator implements Iterator<MenuComponent> {
	Stack<Iterator<MenuComponent>> stack = new Stack<Iterator<MenuComponent>>();

	public CompositeIterator(Iterable<MenuComponent> iterable) {
		stack.push(iterable.iterator());
	}

	@Override
	public MenuComponent next() {
		if (hasNext()) {
			Iterator<MenuComponent> iterator = stack.peek();
			MenuComponent component = iterator.next();
			stack.push(component.iterator());
			return component;
		} else {
			throw new NoSuchElementException();
		}
	}

	@Override
	public boolean hasNext() {
		if (stack.empty()) {
			return false;
		} else {
			Iterator<MenuComponent> iterator = stack.peek();
			if (!iterator.hasNext()) {
				stack.pop();
				return hasNext();
			} else {
				return true;
			}
		}
	}

}
