import java.util.*;
public class Exercise10_5 
{
	public static void main(String[] args)
	{System.out.print("Enter a positive integer:");
	Scanner input = new Scanner(System.in);
	int number=input.nextInt();
	StackOfIntegers st = new StackOfIntegers();
	int limit=number;
	for(int i=2;i<=limit;i++)//��2�������Լ�������
		{if(isPrime(i))	
			while(number%i==0)//�������ͳ���ͷ
				{st.store(i);//�浽stack
				number=number/i;
				} 
		else	continue;//��������������
		}
	System.out.print("The factors are: ");
	while(!st.stackEmpty()) System.out.print(st.getFactor()+"  ");
	}
	
	//�ж�����
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
	 //������20��λ���ˣ��ҿ����϶������ᳬ�԰�
	}
	
	public int getFactor()
	{int temp=factors[i--];
	return temp;
		
	}
	
	public boolean stackEmpty()
	{return i==-1;}
	
}