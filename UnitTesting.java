import javax.swing.JFrame;

/**
 * @author ALI ARDA EKER
 * @since 11.26.2014
 * @version 1.0.0.1
 */
public class UnitTesting 
{
	public static void main(String[] args)
	{
	JFrame test = new Frame();
	
	//Tests the frame
	test.setTitle("Unit Testing");
	test.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	test.setVisible(false);
	
	//Tests the methods panel and button
	Frame testPanel = new Frame();
	testPanel.createPanel();
	testPanel.createButton();
	}
}
