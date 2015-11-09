package gui.view;

import javax.swing.JPanel;
import gui.controller.GUIController;

/**
 * 
 * @author gmit3891
 *@version 0.1 Nov 9,2015
 *
 */
public class GUIPanel extends JPanel
{
	private GUIController baseController;
	
	public GUIPanel(GUIController baseController)
	{
		this.baseController = baseController;
	}
}
