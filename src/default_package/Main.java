package default_package;
import javax.swing.*;


public class Main extends JFrame{
	
	private static final long serialVersionUID = 0L;
	static JFrame myFrame = new JFrame();
    public static void main(final String [] args) {
		@SuppressWarnings("unused")
		Gui window= new Gui();
		Starter.run();
    }
}