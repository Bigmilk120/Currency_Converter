package default_package;

import java.awt.event.*;

import javax.swing.*;

public class userTesting extends JFrame{
	 /**
	 * 
	 */
	private static final long serialVersionUID = 2L;
	private static JLabel label = new JLabel("To go next, click the button!");
	private static JButton button = new JButton("Click me!");
	public static void testingUser() 
	{
			JFrame myFrame = gui.getFrame();
			JPanel mainPanel = gui.getPanel();
	    	

		    button.addActionListener(new ActionListener()
		    {
		   	  public void actionPerformed(ActionEvent e)
		   	  {
		   		  new Thread() {
		   			  public void run() {
			    		  amountAsker.askForAmount();
	    			  }
		   		  }.start();
		    	 }
		    });
	    	mainPanel.add(label);
	   		mainPanel.add(button);
	    		

	    	myFrame.setVisible(true);
	    }
}
