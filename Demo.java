import javax.swing.JFrame;

/**
 * @author ALI ARDA EKER
 * @since 11.26.2014
 * @version 1.0.0.1
 */
public class Demo 
{
	public static void main(String[] args)
	{
	Frame frame = new Frame();
	frame.createPanel();
	
	//Sets the title
	frame.setTitle("Calculator");
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setVisible(true);
	}
}
