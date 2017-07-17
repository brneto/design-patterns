package pizzashop.product;

public class CheesePizza extends Pizza {
	
	public CheesePizza() {
		name = "Cheese Pizza";
		dough = "Extra Thick Crust Dough";
		sauce = "Plum Tomato Sauce";
		
		toppings.add("Shredded Mozzarella Cheese");
	}

	@Override
	public void prepare() {
		System.out.println("preparing cheese pizza...");
	}

	@Override
	public void bake() {
		System.out.println("baking cheese pizza...");
	}

	@Override
	public void cut() {
		System.out.println("cutting cheese pizza...");
	}

	@Override
	public void box() {
		System.out.println("boxing cheese pizza...");
	}

}
