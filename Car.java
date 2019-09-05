import java.util.*;

public class Car
{
	public static int randomizePosition()
	{
		int randNumber = (int)(Math.random() * 20 + 1);
		return randNumber;
	}
	
	public static char assignColor()
	{
		String colorString = "RGBWS";
		int tmp = (int)(Math.random() * colorString.length());
	
		char colorChar = colorString.charAt(tmp);
		return colorChar; 
	}
	
	public static boolean ignitionSwitch(boolean ignitionSwitch)
	//here the default value of boolean type is false
	{
		ignitionSwitch = !ignitionSwitch; // switch the value to opposite
		return ignitionSwitch;
	}
	
	public static int moveHorizontally(int x, int xInput, boolean ignitionState)
	{
		
		if(ignitionState == false)
		{
			System.out.println("the ignitionState is off");
			System.out.println();
			return x;
		}
		else
		{
			if(x + xInput < 1 || x + xInput > 20)
			{
				System.out.println("out of boundary");
				System.out.println();
				return x;
			}
			else
			{
				return x + xInput; 
			}
		}
	}
	
	public static int moveVertically(int y, int yInput, boolean ignitionState)
	{
		
		
		if(ignitionState == false)
		{
			System.out.println("the ignitionState is off");
			System.out.println();
			return y;
		}
		else
		{
			if(y + yInput < 1 || y + yInput > 20)
			{
				System.out.println("out of boundary");
				System.out.println();
				return y;
			}
			else
			{
				return y + yInput; 
			}
		}
	}
	
	public static void reportState(boolean ignition, char charColor, int x, int y)
	{
		String ignitionState = "";
		String stringColor = "";
		String position  = "(" +x+ "," +y+ ")";
		
		if(ignition == true)
		{
			ignitionState = "on";
		}
		else
		{
			ignitionState = "off";
		}
		
		if(charColor == 'R')
		{
			stringColor = "Red";
		}
		else if(charColor == 'G')
		{
			stringColor = "Green";
		}
		else if(charColor == 'B')
		{
			stringColor = "Black";
		}
		else if(charColor == 'W')
		{
			stringColor = "White";
		}
		else if(charColor == 'S')
		{
			stringColor = "Silver";
		}
		
		System.out.println("Car Information");
		System.out.println("Color: " + stringColor);
		System.out.println("Ignition: " + ignitionState);
		System.out.println("Location: " + position);
		
		for(int i = 1; i <= 20; i++)
		{
			for(int j = 1; j <= 20; j++)
			{
				if((j == x) &&(i == y))
				{
					System.out.print(charColor);
				}
				else
				{
					System.out.print("-");	
				}
			}
			System.out.println();
		}
	}
	//until here, static methods
	
	
	public static void main(String[]args)
	{	
		boolean ignition = false;
		int x = randomizePosition();
		int y = randomizePosition();
		char colorChar = assignColor();
		
		while(true)
		{
			Scanner scan = new Scanner(System.in);
			
			System.out.println("What would you like to do?");
			System.out.println("1: Turn the ignition on/off");
			System.out.println("2: Change the position of the car");
			System.out.println("Q: Quit this program");
			
			String input = scan.nextLine(); 
			System.out.println("Input: " + input);
			System.out.println();
			
			if(input.equals("1"))
			{
				ignition = ignitionSwitch(ignition); // true
				reportState(ignition, colorChar, x, y);
			}
			else if(input.equals("2"))
			{
				System.out.println("In which direction do you want to move the car?");
				System.out.println("H: Horizontal");
				System.out.println("V: Vertical");
				String inputSecond = scan.nextLine();
				
				System.out.println("Direction: " + inputSecond);
				System.out.println();
				
				if(inputSecond.equals("H"))
				{
					System.out.println("Enter a movement distance: ");
					int inputH = scan.nextInt();
					x = moveHorizontally(x, inputH, ignition);
					reportState(ignition, colorChar, x, y);
				}
				else if(inputSecond.equals("V"))
				{
					System.out.println("Enter a movement distance: ");
					int inputV = scan.nextInt(); 
					y = moveVertically(y, inputV, ignition); 
					reportState(ignition, colorChar, x, y);
				}
				else
				{
					System.out.println("you put the wrong input here, try again");
					System.out.println();
				}
			}
			else if(input.equals("Q"))
			{
				System.out.println("you ended the program");
				return; // if the condition comes here, the return will terminate the calling method
			}
			else
			{
				System.out.println("you put the wrong input here, try again");
				System.out.println();
			}
		}
	}
}