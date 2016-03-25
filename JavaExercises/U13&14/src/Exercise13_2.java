import java.util.*;

public class Exercise13_2 
{	public static void main(String[] args)
	{Scanner input=new Scanner(System.in);
	System.out.print("Enter two integers please:");
	int a=1,b=1;
	
	while(true)
	try{a=input.nextInt();
		b=input.nextInt();
		break;
		}
	catch(RuntimeException ex)
		{System.out.print("Integers, please. Try again: ");	
		input.nextLine();
		}
	

	
	System.out.print("The integers you entered are "+a+", "+b
			+" and the sum is " +(a+b));
	}

}
