package gui.controller;

import gui.view.GUIFrame;

/**
 * myController for the Stupid GUI Application
 * @author gmit3891
 *@version 0.1 Nov 9, 2015
 */
public class GUIController
{
	
	/**
	 * Refers to the GUIFrame object for internal use
	 */
	private GUIFrame baseFrame;
	
	/**
	 * Creates a GUIController and initializes the GUIFrame
	 */
	public GUIController()
	{
		baseFrame = new GUIFrame(this);
	}
	
	public void start()
	{
		
	}
}
