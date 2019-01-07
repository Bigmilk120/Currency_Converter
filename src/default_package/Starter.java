package default_package;

import java.awt.event.*;

import javax.swing.*;

public class Starter extends JFrame{

	private static final long serialVersionUID = 2L;
	private static JLabel label = new JLabel("To go next, click the button!");
	private static JButton button = new JButton("Click me!");
	
	public static void run() 
	{
			JFrame myFrame = Gui.getFrame();
			JPanel mainPanel = Gui.getPanel();
	    	

		    button.addActionListener(new ActionListener()
		    {
		   	  public void actionPerformed(ActionEvent e)
		   	  {
		   		  new Thread() {
		   			  public void run() {
		   				  label.setVisible(false);
		   				  button.setVisible(false);
			    		  AmountAsker.askForAmount();
	    			  }
		   		  }.start();
		    	 }
		    });
	    	mainPanel.add(label);
	   		mainPanel.add(button);
	    		

	    	myFrame.setVisible(true);
	    }
}
