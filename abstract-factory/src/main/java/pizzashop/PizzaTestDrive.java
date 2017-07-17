package pizzashop;

import pizzashop.client.PizzaStore;
import pizzashop.factory.PizzaFactory;
import pizzashop.factory.concrete.SimplePizzaFactory;
import pizzashop.product.pizza.Pizza;
import pizzashop.product.pizza.type.PizzaType;

public class PizzaTestDrive {

	public static void main(String[] args) {
		PizzaFactory pizzaFactory = new SimplePizzaFactory();
		PizzaStore store = new PizzaStore(pizzaFactory);
		
		Pizza pizza = store.orderPizza(PizzaType.CHEESE);
		System.out.println("Ethan ordered a " + pizza.getName() + "\n");
		
	}

}
