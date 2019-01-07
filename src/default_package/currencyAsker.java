package default_package;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class currencyAsker {

	private static JTextField input = new JTextField(15);	
	static JLabel label = new JLabel("Enter shortcut to the currency you want to convert.");
	private static JButton button = new JButton("Go next!");

	public static  void askForCurrency(double amount) {
    	JFrame myFrame = gui.getFrame();
		JPanel mainPanel = gui.getPanel();
		input.setMaximumSize(new Dimension(400,50));
		mainPanel.add(label);
		mainPanel.add(input);
		mainPanel.add(button);
		button.addActionListener(new ActionListener()
	    {
	   	  public void actionPerformed(ActionEvent e)
	   	  {
	   		  new Thread() {
	   			  public void run() {
		    		  liveRequest.sendLiveRequest(input.getText().toUpperCase(), amount);
    			  }
	   		  }.start();
	    	 }
	    });
		
		myFrame.setVisible(true);
    }

}
