package default_package;

import java.util.Scanner;

public class amountAsker {
	
	static double amount=0;
	
	public static double askForAmount(){
		System.out.println("How much money do you want to change?");
		Scanner reader = new Scanner(System.in);
		amount=reader.nextDouble();
		reader.close();
		return amount;
	}
}
