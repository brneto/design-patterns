package pizzashop.factorymethod.concrete;

import pizzashop.abstractfactory.ingredient.concrete.ChicagoPizzaIngredientFactory;
import pizzashop.factorymethod.PizzaStore;
import pizzashop.product.pizza.Pizza;
import pizzashop.product.pizza.exception.InvalidPizzaType;
import pizzashop.product.pizza.type.PizzaType;

public class ChicagoPizzaStore extends PizzaStore {

  public ChicagoPizzaStore() {
    super(new ChicagoPizzaIngredientFactory());
  }

  @Override
  protected Pizza createPizza(PizzaType type) throws InvalidPizzaType {
    return choosePizza(type).setName("Chicago Style Cheese Pizza");
  }
}
