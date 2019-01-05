package default_package;
import default_package.*;

public class main {

    public static void main(final String [] args) {
    	
    	userTesting.testingUser();
    	String currency=currencyAsker.askForCurrency();
    	double amount = amountAsker.askForAmount();
        liveRequest.sendLiveRequest(currency,amount);
        
    }
}