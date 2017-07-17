package pizzashop.product;

public class PepperoniPizza extends Pizza {
	
	public PepperoniPizza() {
		name = "Pepperoni Pizza";
		dough = "Extra Thick Crust Dough";
		sauce = "Plum Tomato Sauce";
		
		toppings.add("Shredded Mozzarella Cheese");
	}

	@Override
	public void prepare() {
		System.out.println("preparing pepperoni pizza...");
	}

	@Override
	public void bake() {
		System.out.println("baking pepperoni pizza...");
	}

	@Override
	public void cut() {
		System.out.println("cutting pepperoni pizza...");
	}

	@Override
	public void box() {
		System.out.println("boxing pepperoni pizza...");
	}

}
