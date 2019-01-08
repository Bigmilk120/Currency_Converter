package default_package;
import javax.swing.*;

import com.sun.javafx.text.GlyphLayout;

public class Gui extends JFrame{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	static JFrame myFrame;
    static JPanel mainPanel;
	public Gui(){
    	SwingUtilities.invokeLater(new Runnable() {  
	    	public void run() {
	    		myFrame=new JFrame("Currency Converter");
	    		myFrame.setSize(400,200);
	    		
	    		mainPanel = new JPanel();
	    		mainPanel.setLayout(new BoxLayout(mainPanel, GlyphLayout.LAYOUT_LEFT_TO_RIGHT));
	    		
	            myFrame.getContentPane().add(mainPanel);
	            myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    		myFrame.setVisible(true);

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
