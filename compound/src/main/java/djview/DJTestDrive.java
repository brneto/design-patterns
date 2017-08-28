package djview;

import djview.controller.BeatController;
import djview.model.BeatModel;
import djview.model.BeatModelInterface;

public class DJTestDrive {

	public static void main(String[] args) {
		BeatModelInterface model = new BeatModel();
		new BeatController(model);
	}

}
