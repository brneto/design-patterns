package pizzashop.product;

public class GreekPizza extends Pizza {
	
	public GreekPizza() {
		name = "Greek Pizza";
		dough = "Extra Thick Crust Dough";
		sauce = "Plum Tomato Sauce";
		
		toppings.add("Shredded Mozzarella Cheese");
	}

	@Override
	public void prepare() {
		System.out.println("preparing greek pizza...");
	}

	@Override
	public void bake() {
		System.out.println("baking greek pizza...");
	}

	@Override
	public void cut() {
		System.out.println("cutting greek pizza...");
	}

	@Override
	public void box() {
		System.out.println("boxing greek pizza...");
	}

}
