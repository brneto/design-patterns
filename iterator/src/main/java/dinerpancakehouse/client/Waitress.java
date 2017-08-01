package dinerpancakehouse.client;

import dinerpancakehouse.elements.MenuItem;

public class Waitress {
	Iterable<MenuItem> pancakeHouseMenu, dinerMenu;

	public Waitress(Iterable<MenuItem> pancakeHouseMenu, Iterable<MenuItem> dinerMenu) {
		this.pancakeHouseMenu = pancakeHouseMenu;
		this.dinerMenu = dinerMenu;
	}

	public void printMenu() {
		System.out.println("MENU\n----\nBREAKFAST");
		printMenu(pancakeHouseMenu);
		System.out.println("\nLUNCH");
		printMenu(dinerMenu);
	}

	private void printMenu(Iterable<MenuItem> Iterable) {
		for (MenuItem item : Iterable) {
			System.out.print(item.getName() + ", ");
			System.out.print(item.getPrice() + " -- ");
			System.out.println(item.getDescription());
		}
	}
}
