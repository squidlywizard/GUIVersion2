package view;

import javax.swing.JFrame ;
import control.control;
import view.panel;

public class frame extends JFrame
{
	private control appController;
	private panel appPanel;
	
	public frame(control appController) 
	{
		super();
		
		this.appController = appController;
		this.appPanel = new panel(appController);
		
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setContentPane(appPanel);
		this.setSize(1000, 500);
		this.setTitle("eh I couldnt think of anything");
		this.setResizable(false);
		this.setVisible(true);
	}

}
