package pizzashop.pizza;

public class PepperoniPizza implements Pizza {

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
