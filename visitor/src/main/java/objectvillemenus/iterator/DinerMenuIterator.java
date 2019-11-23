package objectvillemenus.iterator;

import static java.util.Optional.ofNullable;

import java.util.Iterator;
import java.util.NoSuchElementException;
import objectvillemenus.element.MenuItem;

public class DinerMenuIterator implements Iterator<MenuItem> {

  private final MenuItem[] items;
  private int position;

  public DinerMenuIterator(MenuItem[] items) {
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
    if (position < 1) {
      throw new IllegalStateException
          ("You can’t remove an item until you’ve done at least one next()");
    }
    ofNullable(items[position - 1])
        .ifPresent(e -> {
          for (int i = position - 1; i < (items.length - 1); i++) {
            items[i] = items[i + 1];
          }
          items[items.length - 1] = null;
        });
  }

}
