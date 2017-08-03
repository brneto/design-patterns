package dinerpancakehouse.iterator;

import java.util.Iterator;
import java.util.NoSuchElementException;

import dinerpancakehouse.elements.MenuItem;

public class DinerMenuIterator implements Iterator<MenuItem> {
	private MenuItem[] items;
	private int position;

	public DinerMenuIterator(MenuItem[] items) {
		this.items = items;
	}

	@Override
	public MenuItem next() {
		if (hasNext())
			return items[position++];
		else
			throw new NoSuchElementException();
	}

	@Override
	public boolean hasNext() {
		if (position >= items.length || items[position] == null)
			return false;
		return true;
	}

	@Override
	public void remove() {
		if (position <= 0) {
			throw new IllegalStateException
				("You can’t remove an item until you’ve done at least one next()");
		}
		if (items[position - 1] != null) {
			for (int i = position - 1; i < (items.length - 1); i++) {
				items[i] = items[i + 1];
			}
			items[items.length - 1] = null;
		}
	}

}
