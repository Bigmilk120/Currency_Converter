package default_package;
import javax.swing.*;

import com.sun.javafx.text.GlyphLayout;

public class gui extends JFrame{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	static JFrame myFrame;
    static JPanel mainPanel;
	public gui(){
    	SwingUtilities.invokeLater(new Runnable() {  
	    	public void run() {
	    		myFrame=new JFrame("Currency Converter");
	    		myFrame.setSize(600,400);
	    		myFrame.setVisible(true);
	    		
	    		mainPanel = new JPanel();
	    		mainPanel.setLayout(new BoxLayout(mainPanel, GlyphLayout.LAYOUT_LEFT_TO_RIGHT));
	    		
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
