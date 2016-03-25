import java.util.*;
public class Exercise10_5 
{
	public static void main(String[] args)
	{System.out.print("Enter a positive integer:");
	Scanner input = new Scanner(System.in);
	int number=input.nextInt();
	StackOfIntegers st = new StackOfIntegers();
	int limit=number;
	for(int i=2;i<=limit;i++)//从2到数字自己试因数
		{if(isPrime(i))	
			while(number%i==0)//是素数就除到头
				{st.store(i);//存到stack
				number=number/i;
				} 
		else	continue;//不是素数就跳过
		}
	System.out.print("The factors are: ");
	while(!st.stackEmpty()) System.out.print(st.getFactor()+"  ");
	}
	
	//判断素数
	public static boolean isPrime(int i)
	{		if(i<=1) return false;
	else	if(i==2) return true;
	else 	if(i%2==0) return false;
	else
		{for(int t=3;t<Math.sqrt(i);t+=2 )
			if(i%t==0) return false;
		return true;
		}
	}

}




class StackOfIntegers
{private int[] factors=new int[20];
	static int i=-1;
	
	StackOfIntegers()
	{}
	
	public void store(int factor)
	{i++;
		factors[i]=factor;
	 //都留了20个位置了，我可以认定它不会超对吧
	}
	
	public int getFactor()
	{int temp=factors[i--];
	return temp;
		
	}
	
	public boolean stackEmpty()
	{return i==-1;}
	
}