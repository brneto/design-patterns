package dinerpancakehouse.iterator;

import java.util.ArrayList;
import java.util.Iterator;

import dinerpancakehouse.elements.MenuItem;

public class PancakeHouseMenuIterator implements Iterator<MenuItem> {
	ArrayList<MenuItem> items;
	int position;

	public PancakeHouseMenuIterator(ArrayList<MenuItem> items) {
		this.items = items;
	}

	@Override
	public boolean hasNext() {
		if (position >= items.size() || items.get(position) == null)
			return false;
		return true;
	}

	@Override
	public MenuItem next() {
		if (hasNext())
		return null;
	}

}
