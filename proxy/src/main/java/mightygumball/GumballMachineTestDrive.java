package mightygumball;

import java.rmi.Naming;

import mightygumball.client.GumballMonitor;
import mightygumball.remote.GumballMachineRemote;

public class GumballMachineTestDrive {

	public static void main(String[] args) {
		String[] option = {"seattle.mightygumball.com", "250"};
		args = option;
		
		String [] location = {"rmi://santafe.mightygumball.com/gumballmachine",
							  "rmi://boulder.mightygumball.com/gumballmachine",
							  "rmi://seattle.mightygumball.com/gumballmachine"};
		
		GumballMonitor[] monitor = new GumballMonitor[location.length];
		
		for (int i=0; i < location.length; i++) {
			try {
				GumballMachineRemote machine =
						(GumballMachineRemote) Naming.lookup(location[i]);
				monitor[i] = new GumballMonitor(machine);
				
				System.out.println(monitor[i]);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		for (int i=0; i < monitor.length; i++) {
			monitor[i].report();
		}
	}

}
