import java.util.*;
public class Exercise10_7
{	public static void main(String[] args)
	{Account[] account=new Account[10];
		for(int i=0;i<=9;i++)	
		{account[i]=new Account();
		account[i].changeId(i);
		account[i].changeBalance(100);
		}
		
	Scanner input=new Scanner(System.in);
	int select=1;
		while(select!=5)
		{System.out.print("Enter an ID: ");
		int id=input.nextInt();
			while(id<0||id>9)
			{System.out.print("Incorrect ID, try again: ");
			id=input.nextInt();
			}
			
			while(true)
			{System.out.println("");
			System.out.println("Main Menu:");
			System.out.println("1.check balance");
			System.out.println("2.withdraw");
			System.out.println("3.deposit");
			System.out.println("4.exit (this account's operations)");
			System.out.println("5.end this program");
			System.out.println("Enter a choice: ");
			select=input.nextInt();
		    if(select==5||select==4) break;
				switch(select)
				{case 1: System.out.println("The balance is "+account[id].getBalance());break;
				case 2: {System.out.println("Enter the amount you want to withdraw: ");
						double withdrawAmount=input.nextDouble();
							if(withdrawAmount>account[id].getBalance())
							{System.out.println("The balance is "+account[id].getBalance()+
									" So you can't withdraw this much.");
							break;
							}
							account[id].withdraw(withdrawAmount);
							System.out.println("The balance now is "+account[id].getBalance());
							break;
						}
				case 3:{System.out.println("Enter the amount you want to deposit: ");
						double depositAmount=input.nextDouble();
						account[id].deposit(depositAmount);
						System.out.println("The balance now is "+account[id].getBalance());
						break;
						}
				default: System.out.print("Please enter 1~5: ");break;
				}
				
			}
		}	
	}

}



