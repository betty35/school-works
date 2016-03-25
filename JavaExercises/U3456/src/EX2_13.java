import java.util.Scanner;
public class EX2_13 
{public static void main(String[] args)
	{//Financial application
	//Create a  Scanner
	Scanner input= new Scanner(System.in);
	System.out.print("Enter investment amount: ");
	double investment= input.nextDouble();
	System.out.print("Enter annually interest rate in percentage: ");
	double monthly_rate= input.nextDouble()/100/12;
	System.out.print("Enter number of years: ");
	int years= input.nextInt();
	double value=investment*Math.pow(1+monthly_rate,years*12);
	value=(int)(value*100)/100.0;
	System.out.println("Accumulated value is " + value);
	}

}
