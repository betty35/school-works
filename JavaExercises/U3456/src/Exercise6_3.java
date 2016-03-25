import java.util.Scanner;
public class Exercise6_3 
{
	public static void main(String[] args)
	{int[] count= new int[100];
	int[] numbers= new int[20];
	int no=0; String time; 
	Scanner input= new Scanner(System.in);
	System.out.println("Enter the integers between 1 and 100 and end with a 0 (no more than 20 numbers please):");
	do 
		{numbers[no]=input.nextInt();
		if(numbers[no]>100||numbers[no]<0) 
			{System.out.println("Out of range 0~100. Try again."); continue;}
	    no++;           
		}
	while(numbers[no-1]!=0&&no<20);
	for(int i=0;i<20;i++) if(numbers[i]!=0) count[numbers[i]-1]++;
	for(int i=0;i<100;i++) 
		if(count[i]!=0) 
			{if(count[i]==1)    time="time";
			else                time="times";
			System.out.println((char)(i+1)+" occurs" + time + count[i]);
			}
	}
}
