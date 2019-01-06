package default_package;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class gui extends JFrame{
    static JFrame myFrame;

	public gui(){
    	SwingUtilities.invokeLater(new Runnable() {  
	    	public void run() {
	    		myFrame=new JFrame("Currency Converter");
	    		myFrame.setSize(600,400);
	    		myFrame.setVisible(true);
	    	}
    	});
    	
    };
    public static JFrame getFrame() {
        return myFrame;
    }
}
