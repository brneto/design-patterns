package objectvillemenus.composite.iterator;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Stack;

import objectvillemenus.component.MenuComponent;
import objectvillemenus.composite.Menu;

public class CompositeIterator implements Iterator<MenuComponent> {
	Stack<Iterable<MenuComponent>> stack = new Stack<Iterable<MenuComponent>>();

	public CompositeIterator(Iterable<MenuComponent> iterable) {
		stack.push(iterable);
	}

	@Override
	public MenuComponent next() {
		if (hasNext()) {
			MenuComponent component = stack.peek().iterator().next();
			if (component instanceof Menu) {
				stack.push(component);
			}
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
			if (!stack.peek().iterator().hasNext()) {
				stack.pop();
				return hasNext();
			} else {
				return true;
			}
		}
	}

}
