package mvp.boot;

import mvp.model.Model;
import mvp.model.MyModel;
import mvp.presenter.Presenter;
import mvp.view.BasicWindow;
import mvp.view.ConsoleView;
import mvp.view.ControlScreen;
import mvp.view.View;

public class Run {

	public static void main(String[] args) {

		
	//This is the MVP connection while using the GUI.
		MyModel model = new MyModel();
		ControlScreen view = new ControlScreen("3D Labyrinth", 300, 600);
		Presenter pres = new Presenter(view, model);
		model.addObserver(pres);
		view.addObserver(pres);
		
		view.run();
		
		
		//This is the MVP connection while using the console.
	/*	MyModel model = new MyModel();
		ConsoleView view = new ConsoleView();
		Presenter pres = new Presenter(view, model);	
		model.addObserver(pres);
		view.addObserver(pres);		
		view.run();*/
		
	}

}
