package chocoholic.singleton.doublechecked;

public class ChocolateBoilerClient {

	public static void main(String[] args) {
		ChocolateBoiler boiler = ChocolateBoiler.getInstance();
		boiler.fill();
		boiler.boil();
		boiler.drain();
	}

}
