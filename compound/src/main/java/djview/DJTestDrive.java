package djview;

import djview.controller.BeatController;
import djview.controller.ControllerInterface;
import djview.model.BeatModel;
import djview.model.BeatModelInterface;

public class DJTestDrive {

	public static void main(String[] args) {
		BeatModelInterface model = new BeatModel();
		ControllerInterface controller = new BeatController(model);
	}

}
