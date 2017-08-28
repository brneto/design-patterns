package djview;

import djview.controller.HeartController;
import djview.model.HeartModel;

public class HeartTestDrive {

	public static void main(String[] args) {
		HeartModel heartModel = new HeartModel();
		new HeartController(heartModel);
	}

}
