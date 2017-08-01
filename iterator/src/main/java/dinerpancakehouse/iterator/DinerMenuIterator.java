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
		if(position >= items.length || items[position] == null)
			return false;
		return true;
	}

}
