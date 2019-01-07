package default_package;
import javax.swing.*;

public class gui extends JFrame{
    static JFrame myFrame;
    static JPanel mainPanel;
	public gui(){
    	SwingUtilities.invokeLater(new Runnable() {  
	    	public void run() {
	    		myFrame=new JFrame("Currency Converter");
	    		myFrame.setSize(600,400);
	    		myFrame.setVisible(true);
	    		
	    		mainPanel = new JPanel();
	    		mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
	    		
	            myFrame.getContentPane().add(mainPanel);
	           // myFrame.pack();
	    		
	    	}
    	});
    	
    };
    public static JFrame getFrame() {
        return myFrame;
    }
    public static JPanel getPanel() {
        return mainPanel;
    }
}
