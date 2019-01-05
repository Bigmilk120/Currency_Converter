package default_package;

import java.util.Scanner;

import javax.swing.JFrame;

public class userTesting {
	 private static Scanner reader;

	public static void testingUser() {
	    	System.out.println("Hello. Are you there? Please press 'y' to go next.");
	    	reader = new Scanner(System.in);
	    	String sign = reader.nextLine();
	    	if(sign.equals("y")||sign.equals("yes")||sign.equals("Y")||sign.equals("YES")) {
	    		
	    	}else {
	    		System.out.println("I will now close");
	    		System.exit(0);
	    	}
	    }
}
