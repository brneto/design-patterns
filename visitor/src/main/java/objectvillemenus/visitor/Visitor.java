package objectvillemenus.visitor;

import objectvillemenus.element.MenuItem;

public interface Visitor {
  void visit(MenuItem menuItem);
}
