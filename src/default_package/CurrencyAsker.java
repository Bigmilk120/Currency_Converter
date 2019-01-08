package default_package;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CurrencyAsker {

	private static JTextField input = new JTextField(15);	
	static JLabel label = new JLabel("Enter shortcut to the currency you want to convert.");
	private static JButton button = new JButton("Go next!");

	public static  void askForCurrency(double amount) {
    	JFrame myFrame = Gui.getFrame();
		JPanel mainPanel = Gui.getPanel();
		input.setMaximumSize(new Dimension(400,50));
		mainPanel.add(label);
		mainPanel.add(input);
		mainPanel.add(button);
		
		String[] currencies = new String[] {"AED","AUD","BGN","BTC","CAD","CNY","EUR","HKD","INR","JPY","NOK","NZD","PLN","RSD","RUB","SEK","TRY","USD","XAG","XAU"};
		
		
		button.addActionListener(new ActionListener()
	    {
	   	  public void actionPerformed(ActionEvent e)
	   	  {
	   		  new Thread() {
	   			  public void run() {
	   				  
	   				  String currency = input.getText().toUpperCase();
	   				  for(int i=0;i<20;i++) {
	   					  if(currency.equals(currencies[i])) {
	   						  label.setVisible(false);
	   						  input.setVisible(false);
	   						  button.setVisible(false);
	   			    		  LiveRequest.sendLiveRequest(currency, amount);
	   					  }
	   				  }
	   				  
    			  }
	   		  }.start();
	    	 }
	    });
		
		myFrame.setVisible(true);
    }

}
