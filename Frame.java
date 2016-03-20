import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.*;

/**
 * @author ALI ARDA EKER
 * @since 11.26.2014
 * @version 1.0.0.1
 */
public class Frame extends JFrame
{
	private static final long serialVersionUID = 1L;
	private static final int WIDTH = 210; 
	private static final int HEIGHT = 285;
	ArrayList<String> hold = new ArrayList<String>();
	ArrayList<String> operations = new ArrayList<String>();
	ArrayList<Double> memory = new ArrayList<Double>();
	String allNumbers,control,operation;
	int counter = 0;
	double total,realNumbers,realNumbers2,operant,lastTotal,realLastTotal;
	JButton button0,button1,button2,button3,button4,button5,button6,button7,button8,button9,buttonC,
			buttonPlus,buttonMinus,buttonMultiply,buttonDivide,buttonEqual,
			buttonMS,buttonMR,buttonMC,buttonMplus,buttonMminus;
	JButton[] holdButtons = {buttonC,buttonMS,buttonMR,buttonMC,buttonMplus,buttonMminus,
			button1,button2,button3,button4,button5,button6,button7,button8,button9,button0,
			buttonPlus,buttonMinus,buttonMultiply,buttonDivide,buttonEqual};
	String[] buttonNames = {"C","MS","MR","MC","M+","M-","1","2","3","4","5","6","7","8","9","0","+","-","x","/","="};
	JTextField result = new JTextField(14);
	JPanel panel = new JPanel();
	
	public void createPanel()
	{
	panel.add(result);
	
	for(int i=0; i<holdButtons.length; i++)
	{
	holdButtons[i] = new JButton(buttonNames[i]);
	ActionListener take = new Actions(this);
	holdButtons[i].addActionListener(take);
	}	
	
	for(int i=0; i<holdButtons.length; i++)
	{
	panel.add(holdButtons[i]);
	}
	
	setSize(WIDTH,HEIGHT);
	add(panel);
	}
}
