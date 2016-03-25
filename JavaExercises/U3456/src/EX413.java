//Finding the largest n that n^3<12,000
public class EX413 
{public static void main(String[] args)
	{int n=30;
	while(Math.pow(n,3)<12000) n++;
	n--;
	System.out.println("The largest n is "+n);
	}

}
