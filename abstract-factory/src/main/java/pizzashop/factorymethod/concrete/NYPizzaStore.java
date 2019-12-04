package pizzashop.factorymethod.concrete;

import pizzashop.abstractfactory.ingredient.concrete.NYPizzaIngredientFactory;
import pizzashop.factorymethod.PizzaStore;
import pizzashop.product.pizza.Pizza;
import pizzashop.product.pizza.exception.InvalidPizzaType;
import pizzashop.product.pizza.type.PizzaType;

public class NYPizzaStore extends PizzaStore {

  @Override
  protected Pizza createPizza(PizzaType type) throws InvalidPizzaType {
    return addIngredients(type, new NYPizzaIngredientFactory())
        .setName("New York Style Cheese Pizza");
  }

}
