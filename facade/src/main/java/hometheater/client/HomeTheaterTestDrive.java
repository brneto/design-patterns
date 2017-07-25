package hometheater.client;

import hometheater.facade.HomeTheaterFacade;
import hometheater.subsystem.Amplifier;
import hometheater.subsystem.CdPlayer;
import hometheater.subsystem.DvdPlayer;
import hometheater.subsystem.PopcornPopper;
import hometheater.subsystem.Projector;
import hometheater.subsystem.Screen;
import hometheater.subsystem.TheaterLights;
import hometheater.subsystem.Tuner;

public class HomeTheaterTestDrive {

	public static void main(String[] args) {
		Amplifier amp = new Amplifier();
		Tuner tuner = new Tuner();
		DvdPlayer dvd = new DvdPlayer();
		CdPlayer cd = new CdPlayer();
		Projector projector = new Projector();
		Screen screen = new Screen();
		TheaterLights lights = new TheaterLights();
		PopcornPopper popper = new PopcornPopper();
		
		HomeTheaterFacade homeTheater =
				new HomeTheaterFacade(amp, tuner, dvd, cd,
						projector, screen, lights, popper);
		
		homeTheater.watchMovie("Raiders of the Lost Ark");
		homeTheater.endMovie();
	}

}
