import java.util.Scanner;
public class Exercise6_9 {
	public static double min(double[] array)
	{int no=0;
	double mini=array[no];
	for(no=1;no<10;no++)
		if(mini>array[no]) mini=array[no];
	return mini;
	}

	public static void main(String[] args)
	{double[] put=new double[10];
	double mini;
	Scanner input=new Scanner(System.in);
	System.out.print("Enter ten numbers: ");
	for(int i=0;i<10;i++)
		put[i]=input.nextDouble();
	mini=min(put);
	System.out.println("The minimum number is: "+mini);	
	}
}
