//Game: scissor,rock,paper
import java.util.Scanner;
public class EX317 
{public static void main(String[] args)
	{int count_all=0,count_wins=0,draws=0,enter=1,rnd;String thing,rndthing;
	Scanner input = new Scanner(System.in);
	System.out.println("Scissor, rock, paper!");
	System.out.println("Enter 0 for rock, 1 for scissor and 2 for paper, 3 for show the record"
	+"\nAny other numbers for stop playing!");
	while(enter==0||enter==1||enter==2||enter==3)
		{count_all++;
		System.out.print("rock(0),scissor(1),paper(2),other(stop): ");
		enter= input.nextInt();
		rnd=(int)(Math.random()*3);
		//Strings for outcome
		if(enter==0) thing= "Rock";
		else if(enter==1) thing="Scissor";
		else thing="Paper";
		if(rnd==0) rndthing="Rock";
		else if(rnd==1) rndthing="Scissor";
		else rndthing="Paper";
		//Show the outcome
		if(enter!=0&&enter!=1&&enter!=2&&enter!=3) break;
		else if(enter==3)
			{count_all--;
			System.out.println("Totall: "+count_all+"    Wins: "+count_wins+"   Draws: "+draws);}
		else if(rnd== enter) 
			{System.out.println("Com is "+thing+". You are "+thing+"too. Draw!");
			draws++;
			}
		else if(enter<rnd||(enter==2&&rnd==0))
			{count_wins++;
			System.out.println("Com is "+rndthing+". You are "+thing+". You win!");
			}
		else
			{System.out.println("Com is "+rndthing+". You are "+thing+". You lose!");}
		}
	
	}

}
