package default_package;

import java.util.Scanner;

import javax.swing.*;

public class amountAsker {

	static JLabel label = new JLabel("How much money do you want to change?");
	
	public static double askForAmount(){
		System.out.println("Halloooo");
		

		JFrame myFrame = gui.getFrame();
		JPanel mainPanel = gui.getPanel();
		
		mainPanel.add(label);
		
		
		@SuppressWarnings("resource")
		Scanner reader = new Scanner(System.in);
		double money=reader.nextDouble();
		
		mainPanel.repaint();
		return money;
	}
}
