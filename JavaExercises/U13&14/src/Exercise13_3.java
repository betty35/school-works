import java.util.Scanner;
public class Exercise13_3 
{	public static void main(String[] args)
	{int[] number=new int[100];
	for(int i=0;i<100;i++)
		number[i]=(int)(Math.random()*5000);
	Scanner input=new Scanner(System.in);
	while(true)
		try{System.out.print("Enter the one(1~100) you want to check:");
			int t=input.nextInt()-1;
			System.out.print("number["+(t+1)+"] is "+number[t]);
			break;
		}
		catch(RuntimeException ex)
		{System.out.println("Out of Bounds. Try again.");
		input.nextLine();	
		}
	
	}

}
