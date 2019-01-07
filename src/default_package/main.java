package default_package;
import javax.swing.*;


public class main extends JFrame{

	private static final long serialVersionUID = 0L;
	static JFrame myFrame = new JFrame();
    public static void main(final String [] args) {
        gui window= new gui();
        //JFrame frame = window.getFrame();
        userTesting.testingUser();
    	//String currency=currencyAsker.askForCurrency();
    	//double amount = amountAsker.askForAmount();
        //liveRequest.sendLiveRequest(currency,amount);
    }
}