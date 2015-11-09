package gui.view;

import javax.swing.JFrame;
import gui.controller.GUIController;

/**
 * 
 * @author gmit3891
 *@version 0.1 Nov 9, 2015
 */
public class GUIFrame extends JFrame
{
	private GUIController baseController;
	
	public GUIFrame(GUIController baseController)
	{
		this.baseController = baseController;
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setSize(400,400);
		this.setResizable(false);
		this.setVisible(true);
	}
}