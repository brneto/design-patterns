package pizzashop.exception;

import pizzashop.product.PizzaType;

public class InvalidPizzaType extends RuntimeException {
	private static final long serialVersionUID = 6957556692420127592L;

	public InvalidPizzaType(PizzaType type) {
		super(type.toString());
	}
}
