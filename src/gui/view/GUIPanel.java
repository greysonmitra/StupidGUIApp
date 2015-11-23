package gui.view;

import javax.swing.*; //For layout
import java.awt.event.*;
import java.awt.Color;
import gui.controller.GUIController;

/**
 * 
 * @author gmit3891
 *@version 0.2 Nov 9,2015 updated and added a button click event.
 *
 */
public class GUIPanel extends JPanel
{
	private GUIController baseController;
	private JButton firstButton;
	private JTextField firstField;
	private SpringLayout baseLayout;
	
	public GUIPanel(GUIController baseController)
	{
		this.baseController = baseController;
		
		baseLayout = new SpringLayout();
		firstButton = new JButton("Please do not click the button");
		firstField = new JTextField("words can be typed here");
	
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	/**
	 *Helper method to load all GUI components into Panel 
	 */
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.setBackground(Color.BLUE);
		this.add(firstButton);
		this.add(firstField);
	}
	
	/**
	 * Helper method for arranging the panel.
	 * Dumping ground for WindowBuilder generated code.
	 */
	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.EAST, firstButton, -102, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, firstField, -252, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.NORTH, firstButton, 46, SpringLayout.SOUTH, firstField);
		baseLayout.putConstraint(SpringLayout.WEST, firstField, 45, SpringLayout.WEST, this);
		
	}
	
	private void setupListeners()
	{
		firstButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				firstField.setText("Wow, you managed a click event! Wow!!!!!!!!");
			}
		});
		
		this.addMouseListener(new MouseListener()
		{
			public void mouseClicked(MouseEvent click)
			{
				
			}
			
			public void mouseReleased(MouseEvent released)
			{
				
			}
			
			public void mousePressed(MouseEvent pressed)
			{
				
			}
			
			public void mouseEntered(MouseEvent entered)
			{
				
			}
			
			public void mouseExited(MouseEvent exited)
			{
				
			}
			
		});
		
	}
	
//	if(click = true)
//	{
//		this.setVisible(false);
	//}
}
