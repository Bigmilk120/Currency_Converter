package default_package;


import java.awt.Dimension;

import javax.swing.*;

public class amountAsker {

	static JLabel label = new JLabel("How much money do you want to change?");
	private static JButton button = new JButton("Go next!");
	private static JTextField input = new JTextField(15);	
	
	public static double askForAmount(){		
		JFrame myFrame = gui.getFrame();
		JPanel mainPanel = gui.getPanel();
		input.setMaximumSize(new Dimension(400,50));
		mainPanel.add(label);
		mainPanel.add(input);
		mainPanel.add(button);
		
		myFrame.setVisible(true);
		return 100;
	}
}
