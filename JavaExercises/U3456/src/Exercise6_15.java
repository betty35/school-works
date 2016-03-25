import java.util.Scanner;
public class Exercise6_15 
{
	public static int[] eliminateDuplicates(int[] numbers)
	{int[] result=new int[10];boolean check = false;
	int no=0;
	for(int i=0;i<10;i++)
		{check=true;
		for(int j=i-1;j>=0;j--)
			if(numbers[i]==numbers[j]) 
			{check=false;
			break;
			}
		if(check&&no<10) 
			{result[no]=numbers[i];
			no++;
			}
		}
	return result;
	}

	public static void main(String[] args)
	{Scanner input=new Scanner(System.in);
	int[] numbers=new int[10];
	System.out.print("Enter ten numbers: ");
	for(int i=0;i<10;i++)
		numbers[i]=input.nextInt();
	int[] result=eliminateDuplicates(numbers);
	System.out.print("The distinct numbers are: ");
	for(int i=0;i<10;i++)
		{if(result[i]==0) break;
		System.out.print(result[i]+ " ");
		}
	}
}
