package pizzashop.factorymethod.concrete;

import pizzashop.abstractfactory.ingredient.concrete.ChicagoPizzaIngredientFactory;
import pizzashop.factorymethod.PizzaStore;
import pizzashop.product.pizza.Pizza;
import pizzashop.product.pizza.exception.InvalidPizzaType;
import pizzashop.product.pizza.type.PizzaType;

public class ChicagoPizzaStore extends PizzaStore {

  @Override
  protected Pizza createPizza(PizzaType type) throws InvalidPizzaType {
    return addIngredients(type, new ChicagoPizzaIngredientFactory())
        .setName("Chicago Style Cheese Pizza");
  }
}
