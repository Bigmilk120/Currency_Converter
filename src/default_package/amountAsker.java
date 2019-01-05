package default_package;

import java.util.Scanner;

public class amountAsker {

	
	public static double askForAmount(){
		System.out.println("How much money do you want to change?");
		Scanner reader = new Scanner(System.in);
		double money=reader.nextDouble();
		return money;
	}
}
