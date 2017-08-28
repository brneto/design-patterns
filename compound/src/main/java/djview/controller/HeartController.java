package djview.controller;

import djview.model.HeartModelInterface;
import djview.model.adapter.HeartModelAdapter;
import djview.view.DJView;

public class HeartController implements ControllerInterface {
	HeartModelInterface model;
	DJView view;

	public HeartController(HeartModelInterface model) {
		this.model = model;
		view = new DJView(this, new HeartModelAdapter(model));
		view.createView();
		view.createControls();
		view.disableStopMenuItem();
		view.disableStartMenuItem();
	}

	@Override
	public void start() {}

	@Override
	public void stop() {}

	@Override
	public void increaseBPM() {}

	@Override
	public void decreaseBPM() {}

	@Override
	public void setBPM(int bpm) {}

}
