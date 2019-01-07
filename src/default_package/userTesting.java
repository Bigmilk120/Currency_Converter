package default_package;

import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.*;

public class userTesting extends JFrame{
	 private static Scanner reader;
	 private static JLabel label = new JLabel("Witaj!");
	 private static JLabel label_bye = new JLabel("Żegnaj!");
	 private static JButton button = new JButton("Click me!");
	public static void testingUser() 
	{
			JFrame myFrame = gui.getFrame();
			
	    	
	    	System.out.println("Hello. Are you there? Please press 'y' to go next.");
	    	reader = new Scanner(System.in);
	    	String sign = reader.nextLine();
	    	
	    	
	    	
	    	
	    	if(sign.equals("y")||sign.equals("yes")||sign.equals("Y")||sign.equals("YES")) {
	    		myFrame.add(label);
	    	}else {
	    		myFrame.add(label_bye);
	    		//System.out.println("I will now close");
	    		//System.exit(0);
	    	}
	    	myFrame.setVisible(true);
	    }
}
