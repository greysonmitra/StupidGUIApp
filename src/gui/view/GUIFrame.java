package gui.view;

import javax.swing.JFrame;
import gui.controller.GUIController;

/**
 * 
 * @author gmit3891
 *@version 0.2 Nov 9, 2015 updated the setupFrame to load the contentPane with GUIPanel
 */
public class GUIFrame extends JFrame
{
	private GUIController baseController;
	private GUIPanel basePanel;
	
	public GUIFrame(GUIController baseController)
	{
		this.baseController = baseController;
		basePanel = new GUIPanel(baseController);
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setContentPane(basePanel); //Must be the first line of setupFrame (Actually installs the panel in frame)! So it initializes first.
		this.setSize(400,400); 			//Just find a reasonable size for the type of App.
		this.setTitle("YOOOO");
		this.setResizable(false);       //Not required
		this.setVisible(true);		    //Must be last line of setupFrame! So that is sets up the frame then displays it duh.
	} 
	
	public GUIController getBaseController()
	{
		return baseController;
	}
}