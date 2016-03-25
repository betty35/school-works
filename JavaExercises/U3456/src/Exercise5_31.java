import java.util.Scanner;
public class Exercise5_31 
{
	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    
	    System.out.print("Enter a credit card number as a long integer: ");
	    long number = input.nextLong();
	    
	    if (isValid(number))
	      System.out.println(number + " is valid");
	    else
	      System.out.println(number + " is invalid"); 
	  }
	
	
	public static boolean isValid(long number)
	{ return  (getSize(number) >= 13) && (getSize(number) <= 16) && 
	        (prefixMatched(number, 4) || prefixMatched(number, 5) ||
	                prefixMatched(number, 6) || prefixMatched(number, 37)) && 
	               (sumOfDoubleEvenPlace(number) + sumOfOddPlace(number)) % 10 == 0;
	}

	public static int sumOfDoubleEvenPlace(long number)
	{int sum=0;
	while(number!=0)
	{int even=(int)(number%100/10);
	even=getDigit(even);
	number/=100;
	sum+=even;
	}
	return sum;
	}
	
	public static int getDigit(int number)
	{if(number>=10) 
		number=number/10+number%10;
	return number;}
	
	public static int sumOfOddPlace(long number)
	{int sum=0;
	while(number!=0)
	{long odd=number%10;
	number/=100;
	sum+=odd;}
	return sum;
	}
	
	public static boolean prefixMatched(long number,int d)
	{ return getPrefix(number, getSize(d)) == d;}
	
	public static int getSize(long d)
	{int digits=0;
		while(d!=0)
		{d/=10;	digits++;}
	return digits;
	}
	
	public static long getPrefix(long number,int k)
	{long result = number;
    for (int i = 0; i < getSize(number) - k; i++)
      result /= 10;
    return result;
	}
	
	
	
}
