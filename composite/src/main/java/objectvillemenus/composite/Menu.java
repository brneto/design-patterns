package objectvillemenus.composite;

import java.util.ArrayList;

import objectvillemenus.component.MenuComponent;

public class Menu implements MenuComponent {
	private ArrayList<MenuComponent> menuComponents = new ArrayList<MenuComponent>();
	private String name, description;

	public Menu(String name, String description) {
		this.name = name;
		this.description = description;
	}
	
	@Override
	public void add(MenuComponent menuComponent) {
		menuComponents.add(menuComponent);
	}
	
	@Override
	public void remove(MenuComponent menuComponent) {
		menuComponents.remove(menuComponent);
	}
	
	@Override
	public MenuComponent getChild(int i) {
		return (MenuComponent)menuComponents.get(i);
	}
	
	@Override
	public String getName() {
		return name;
	}
	
	@Override
	public String getDescription() {
		return description;
	}
	
	@Override
	public void print() {
		System.out.print("\n" + getName());
		System.out.println(", " + getDescription());
		System.out.println("---------------------");
		
		menuComponents.forEach(e -> e.print());
	}

}
