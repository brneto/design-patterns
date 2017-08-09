package mightygumball;

public class GumballMachine {
	final static int SOLD_OUT = 0;
	final static int NO_QUARTER = 1;
	final static int HAS_QUARTER = 2;
	final static int SOLD = 3;
	
	int state = SOLD_OUT;

	public void insertQuarter() {
		switch (state) {
		case HAS_QUARTER:
			print("You can't insert another quarter");
		}
		
	}
	
	private void print(String value) {
		System.out.println(value);
	}
	
	public void main()

}
