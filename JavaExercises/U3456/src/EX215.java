//Financial application: compound value
import java.util.Scanner;
public class EX215 
{public static void main(String[] args)
	{
	Scanner input = new Scanner(System.in);
	System.out.print("Write the money you save here: ");
	double money = input.nextDouble();
	System.out.print("Write the months you save them: ");
	int month = input.nextInt();
	for(int i=1;i<=month;i++)
		{
		money*=(1+0.00417);
		System.out.println("After " + i + " month the account is " + (int)(money*1000)/1000.0);
		money+=100;
		}
	}

}
