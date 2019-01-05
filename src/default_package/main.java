package default_package;
import javax.swing.JFrame;

import default_package.*;

public class main extends JFrame{
	
    private static gui myFrame;
    
    public static void main(final String [] args) {
        myFrame = new gui();
        //userTesting.testingUser();
    	String currency=currencyAsker.askForCurrency();
    	double amount = amountAsker.askForAmount();
        liveRequest.sendLiveRequest(currency,amount);
        
    }
    
}