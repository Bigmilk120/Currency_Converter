package default_package;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

import default_package.*;

public class main extends JFrame{
	static JFrame myFrame = new JFrame();
    public static void main(final String [] args) {
        gui window= new gui();
        JFrame frame = window.getFrame();
        userTesting.testingUser();
    	String currency=currencyAsker.askForCurrency();
    	double amount = amountAsker.askForAmount();
        liveRequest.sendLiveRequest(currency,amount);
    }

    public static JFrame getFrame() {
        return myFrame;
    }
}