package objectvillemenus.iterator;

import static java.util.Optional.ofNullable;

import java.util.Iterator;
import java.util.NoSuchElementException;
import objectvillemenus.elements.MenuItem;

public class MenuItemIterator implements Iterator<MenuItem> {

  private MenuItem[] items;
  private int position;

  public MenuItemIterator(MenuItem[] items) {
    this.items = items;
  }

  @Override
  public MenuItem next() {
    if (!hasNext()) throw new NoSuchElementException();
    return items[position++];
  }

  @Override
  public boolean hasNext() {
    return position < items.length && ofNullable(items[position]).isPresent();
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
