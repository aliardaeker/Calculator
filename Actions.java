import java.awt.event.*;

/**
 * @author ALI ARDA EKER
 * @since 11.26.2014
 * @version 1.0.0.1
 */
public class Actions implements ActionListener
{
	/**
	 * constructs Frame object
	 */
	Frame toChange;
	public Actions(Frame f)
	{
		super();
		toChange = f;
	}

	/**
	 * performs all the actions by buttons
	 */
	public void actionPerformed(ActionEvent event)
	{
	String argument = event.getActionCommand();
	switch(argument)
	{
	case "C":
		{
			toChange.result.setText("                                                                               " + 0);
			toChange.memory.clear();
			toChange.allNumbers = "";
			toChange.realNumbers= 0;
			toChange.hold.clear();
		}
	break;
	
	case "0":
		toChange.allNumbers="";
		toChange.hold.add("0");
		
		// Reads the every single digit and prints them on the GUI
		for(int i=0;i<toChange.hold.size();i++)
			{
			toChange.allNumbers = toChange.allNumbers + toChange.hold.get(i);
			
			toChange.result.setText("                                                                               " + toChange.allNumbers);
			}
	break;
	
	case "1":
		toChange.allNumbers="";
		toChange.hold.add("1");
			
		for(int i=0;i<toChange.hold.size();i++)
			{
			toChange.allNumbers = toChange.allNumbers + toChange.hold.get(i);
		
			toChange.result.setText("                                                                               " + toChange.allNumbers);
			}
	break;
	
	case "2":
		{
		toChange.allNumbers="";
		toChange.hold.add("2");
				
		for(int i=0;i<toChange.hold.size();i++)
			{
			toChange.allNumbers = toChange.allNumbers + toChange.hold.get(i);
			
			toChange.result.setText("                                                                               " + toChange.allNumbers);
			}
		}
	break;
	
	case "3":
		{
		toChange.allNumbers="";
		toChange.hold.add("3");
				
		for(int i=0;i<toChange.hold.size();i++)
			{
			toChange.allNumbers = toChange.allNumbers + toChange.hold.get(i);
			
			toChange.result.setText("                                                                               " + toChange.allNumbers);
			}
		}
	break;
	
	case "4":
		{
		toChange.allNumbers="";
		toChange.hold.add("4");
					
		for(int i=0;i<toChange.hold.size();i++)
			{
			toChange.allNumbers = toChange.allNumbers + toChange.hold.get(i);
				
			toChange.result.setText("                                                                               " + toChange.allNumbers);
			}
		}
	break;
	
	case "5":
		{
		toChange.allNumbers="";
		toChange.hold.add("5");
						
		for(int i=0;i<toChange.hold.size();i++)
			{
			toChange.allNumbers = toChange.allNumbers + toChange.hold.get(i);
					
			toChange.result.setText("                                                                               " + toChange.allNumbers);
			}
		}
	break;
	
	case "6":
		{
		toChange.allNumbers="";
		toChange.hold.add("6");
		
		for(int i=0;i<toChange.hold.size();i++)
			{
			toChange.allNumbers = toChange.allNumbers + toChange.hold.get(i);
					
			toChange.result.setText("                                                                               " + toChange.allNumbers);
			}
		}
	break;
	
	case "7":
		{
		toChange.allNumbers="";
		toChange.hold.add("7");
						
		for(int i=0;i<toChange.hold.size();i++)
			{
			toChange.allNumbers = toChange.allNumbers + toChange.hold.get(i);
				
			toChange.result.setText("                                                                               " + toChange.allNumbers);
			}
		}
	break;
	
	case "8":
		{
		toChange.allNumbers="";
		toChange.hold.add("8");
							
		for(int i=0;i<toChange.hold.size();i++)
			{
			toChange.allNumbers = toChange.allNumbers + toChange.hold.get(i);
						
			toChange.result.setText("                                                                               " + toChange.allNumbers);
			}
		}
	break;
	
	case "9":
		{
		toChange.allNumbers="";
		toChange.hold.add("9");
							
		for(int i=0;i<toChange.hold.size();i++)
			{
			toChange.allNumbers = toChange.allNumbers + toChange.hold.get(i);
						
			toChange.result.setText("                                                                               " + toChange.allNumbers);
			}
		}
	break;
	
	case "+":
		{
		toChange.realNumbers = Integer.parseInt(toChange.allNumbers);
		toChange.memory.add(toChange.realNumbers);
		toChange.hold.clear();	
		toChange.operations.add("+");
		}
	break;
	
	case "-":
		{
		toChange.realNumbers = Integer.parseInt(toChange.allNumbers);
		toChange.memory.add(toChange.realNumbers);
		toChange.hold.clear();
		toChange.operations.add("-");
		}
	break;
	
	case "x":
		{
		toChange.realNumbers = Integer.parseInt(toChange.allNumbers);
		toChange.memory.add(toChange.realNumbers);
		toChange.hold.clear();
		toChange.operations.add("x");
		}
	break;
	
	case "/":
		{
		toChange.realNumbers = Integer.parseInt(toChange.allNumbers);
		toChange.memory.add(toChange.realNumbers);
		toChange.hold.clear();
		toChange.operations.add("/");
		}
	break;
	
	case "=":
		{
		toChange.realNumbers2 = Integer.parseInt(toChange.allNumbers);
		toChange.memory.add(toChange.realNumbers2);
		toChange.hold.clear();
		
		toChange.total = toChange.memory.get(toChange.counter);
		toChange.operation = toChange.operations.get(toChange.counter);
		
		// Checks for the toChange.toChange.operations that should take place
		while (toChange.operation=="+"||toChange.operation=="-"||toChange.operation=="x"||toChange.operation=="/")
			{
			toChange.operant = toChange.memory.get(toChange.counter+1);
			
			// Checks the every single toChange.operation
			if(toChange.operation=="+")
				{
				toChange.total = toChange.total + toChange.operant;
				}
			else if(toChange.operation=="-")
				{
				toChange.total = toChange.total - toChange.operant;
				}
			else if(toChange.operation=="x")
				{
				toChange.total = toChange.total * toChange.operant;
				}
			else if(toChange.operation=="/")
				{
				toChange.total = toChange.total / toChange.operant;
				}
			
			// increments the toChange.counter and checks for any index error
			toChange.counter = toChange.counter+1;
			if(toChange.counter==toChange.operations.size())
				{
				toChange.operation = "";
				}
			else
				{
				toChange.operation = toChange.operations.get(toChange.counter);
				}
			}
		
		toChange.counter = 0;
		toChange.result.setText("                                                                               " + toChange.total);
		toChange.lastTotal = toChange.total;
		toChange.total=0;
		toChange.memory.clear();
		toChange.operations.clear();
		}
	break;
	
	case "MS":
		{
		toChange.realLastTotal = toChange.lastTotal;
		toChange.result.setText("M=" + toChange.realLastTotal);
		}
	break;
	
	case "MR":
		{
		toChange.result.setText("                                                                               " + toChange.realLastTotal);
		toChange.memory.add(toChange.realLastTotal); 
		}
	break;
	
	case "MC":
		{
		toChange.result.setText("toChange.memory clear");
		toChange.memory.clear();
		toChange.hold.clear();
		toChange.allNumbers = "";
		toChange.realNumbers = 0;
		toChange.realLastTotal = 0;
		}
	break;
	
	case "M+":
		{
		toChange.realNumbers = Integer.parseInt(toChange.allNumbers);
		toChange.realLastTotal = toChange.realLastTotal + toChange.realNumbers;
		toChange.result.setText("                                                                               " + toChange.realLastTotal);
		toChange.lastTotal = toChange.realLastTotal;
		}
	break;
	
	case "M-":
		{
		toChange.realNumbers = Integer.parseInt(toChange.allNumbers);
		toChange.realLastTotal = toChange.realLastTotal - toChange.realNumbers;
		toChange.result.setText("                                                                               " + toChange.realLastTotal);
		toChange.lastTotal = toChange.realLastTotal;
		}
	break;
	
	default: System.out.println("Button not found");
	break;
	}
	}
}
