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
	
	private void changeRandomColor()
	{
		int red, green, blue;
		red = (int) (Math.random() * 256);
		green = (int) (Math.random() * 256);
		blue = (int) (Math.random() * 256);
		
		this.setBackground(new Color(red, green, blue));
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
				changeRandomColor();
			}
			
			public void mouseReleased(MouseEvent released)
			{
				changeRandomColor();
			}
			
			public void mousePressed(MouseEvent pressed)
			{
				changeRandomColor();
			}
			
			public void mouseEntered(MouseEvent entered)
			{
				changeRandomColor();
			}
			
			public void mouseExited(MouseEvent exited)
			{
				changeRandomColor();
			}
			
		});
		
		this.addMouseMotionListener(new MouseMotionListener()
		{
			public void mouseMoved(MouseEvent moved)
			{
				if(moved.isAltDown())
				{
					changeRandomColor();
				}
				firstField.setText("Mouse X: " + moved.getX() + " Mouse Y:"+ moved.getY() );
				if((Math.abs(moved.getX() - firstButton.getX()) < 140) && (Math.abs(moved.getY() - firstButton.getY()) < 140))
				{
					firstButton.setLocation((int) (Math.random() * 300), (int) (Math.random() * 300));
				}
			}
			
			public void mouseDragged(MouseEvent dragged)
			{
				
			}
		});
	}
	
//	if(click = true)
//	{
//		this.setVisible(false);
	//}
}
