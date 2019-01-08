package default_package;

import java.awt.event.*;

import javax.swing.*;

public class Starter extends JFrame{

	private static final long serialVersionUID = 2L;
	private static JLabel text = new JLabel("To go next, click the button!");
	private static JButton click = new JButton("Click me!");
	
	public static void run() 
	{
			JFrame myFrame = Gui.getFrame();
			JPanel mainPanel = Gui.getPanel();
	    	
			
	    	mainPanel.add(text);
	   		mainPanel.add(click);
	   		
	    	myFrame.setVisible(true);
	    	
	    	click.addActionListener(new ActionListener()
		    {
		   	  public void actionPerformed(ActionEvent e)
		   	  {
		   		  new Thread() {
		   			  public void run() {
		   				text.setVisible(false);
		   				click.setVisible(false);
			    		AmountAsker.askForAmount();
	    			  }
		   		  }.start();
		    	 }
		    });
	    }
}
