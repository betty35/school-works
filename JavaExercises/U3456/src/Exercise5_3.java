import java.util.Scanner;
public class Exercise5_3 
{//Return the reversal of an integer
	public static int reverse(int number)
	{int temp=number,digit;
	number=0;
	while(temp!=0)
		{digit=temp%10;
		temp=temp/10;
		number=number*10+digit;
		}
	return number;	
	}

	public static void main(String[] args)
	{Scanner input=new Scanner(System.in);
	System.out.print("Enter a integer: ");
	int number=input.nextInt();
	System.out.println("The origin number is "+number);
	number=reverse(number);
	System.out.println("The reverse is "+number);
		
		
	}
}
