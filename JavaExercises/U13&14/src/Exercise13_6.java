import java.util.Scanner;
public class Exercise13_6 
{	public static int hexToDecimal(String hex)throws NumberFormatException
	{int dec=0;
	for(int i=0;i<hex.length();i++)
		{char digit=hex.charAt(i);
		if('0'<=digit&&'9'>=digit) 
			dec=dec*16+(digit-'0');
		else if('A'<=digit&&digit<='F')
			dec=dec*16+(digit-'A'+10);
		else 
			throw new NumberFormatException("illegal character: "+digit);
		}
	return dec;
	}


	public static void main(String[] args)
			throws NumberFormatException
	{Scanner input=new Scanner(System.in);
	System.out.println("Change hex to decimal!");
	while(true)
		try{System.out.print("Enter a hex: ");
			String hex=input.next();
			int dec=hexToDecimal(hex);
			System.out.println(hex+" in hex = "+
			dec+" in decimal.");
			break;
			}
		catch(NumberFormatException hex)
		{System.out.println("It's not a hex string."+
		" Try again");
		input.nextLine();
		}
		
	}
}
           
