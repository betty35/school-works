//Game Lottery
import java.util.Scanner;
public class EX315
{	
	//Method match(for non-exact matches only, no=number for short, ld=lottery digit for short)
	//(No instruction of the prize when 2digits matched on book, so I just ignore it)
	public static int match(int no1, int no2, int no3, int ld1, int ld2,int ld3)
	{if(no1==ld1)
		{if(no2==ld3&&no3==ld2) return 2;
		else return 1;
		}
	else if(no1==ld2)
		{if((no2==ld3&&no3==ld1)||(no2==ld1&&no3==ld3)) return 2;
		else return 1;
		}
	else if(no1==ld3)
		{if((no2==ld1&&no3==ld2)||(no2==ld2&&no3==ld1)) return 2;
		else return 1;
		}
	else if(no2==ld1||no2==ld2||no2==ld3||no3==ld1||no3==ld2||no3==ld3) return 1;
	else return 0;
	}
	
	
	
	public static void main(String[] args)
	{//Generate a 3-digit lottery
	int lottery=(int)(Math.random()*900+100);
	
	//Prompt the user to enter a guess
	Scanner input = new Scanner(System.in);
	System.out.print("Enter your lottery pick (3 digits): ");
	int guess = input.nextInt();
	
	//Get digits from lottery
	int digit1 = lottery/100;
	int digit3 = lottery/10;
	int digit2 = lottery/10%10;
	
	//Get digits from guess
	int guess1 = guess/100;
	int guess2 = guess%10;
	int guess3 = guess/10%10;
	
	System.out.println("The lottery number is" + lottery);
	
	//Check the guess
	if(lottery==guess) 
		System.out.println("Exact match, you win $10,000!");
	else
	{int result=match(guess1,guess2,guess3,digit1,digit2,digit3);
		if(result==2) System.out.println("Match all, you win $3,000!");
		else if (result==1) System.out.println("Match one, you win $1,000!");
		else System.out.println("Sorry, no match.");
	}
	
	}
}
