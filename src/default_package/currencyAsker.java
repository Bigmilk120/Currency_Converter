package default_package;

import java.util.Scanner;

public class currencyAsker {
	public static  String askForCurrency() {
    	String currency="";
    	Scanner reader = new Scanner(System.in);
    	
        System.out.println("Enter shortcut to the currency you want to convert.\n");
        currency=reader.nextLine().toUpperCase();            

        return currency;
    }

}
