package dinerpancakehouse.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;

import dinerpancakehouse.elements.MenuItem;

public class PancakeHouseMenuIterator implements Iterator<MenuItem> {
	ArrayList<MenuItem> items;
	int position;

	public PancakeHouseMenuIterator(ArrayList<MenuItem> items) {
		this.items = items;
	}

	@Override
	public MenuItem next() {
		if (hasNext())
			return items.get(position++);
		else
			throw new NoSuchElementException();
	}
	
	@Override
	public boolean hasNext() {
		if (position >= items.size())
			return false;
		return true;
	}

}
