package barista.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import barista.templatemethod.CaffeineBeverage;

public class CoffeeWithHook extends CaffeineBeverage {

	@Override
	public void brew() {
		System.out.println("Dripping Coffee through filter");
	}

	@Override
	public void addCondiments() {
		System.out.println("Adding Sugar and Milk");
	}

	@Override
	protected boolean customerWantsCondiments() {
		String answer = getUserInput();

		if (answer.toLowerCase().startsWith("y")) {
			return true;
		} else {
			return false;
		}
	}

	private String getUserInput() {
		String answer = null;

		System.out.print("Would you like milk and sugar with your coffee (y/n)? ");
		
		// Can't close the buffer reader after all reads are terminated
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		try {
			answer = in.readLine();
		} catch (IOException ioe) {
			System.err.println("IO error trying to read your answer");
			ioe.printStackTrace();
		}

		if (answer == null) {
			return "no";
		}
		return answer;
	}

}
