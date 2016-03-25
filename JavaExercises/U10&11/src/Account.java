import java.util.Date;


public class Account {
	
	private int id=0;
	private static int numberOfAccounts=0;
	private double balance=0;
	private Date dateCreated;
	private static double annualInterestRate=0;



		Account()
		{numberOfAccounts++;
		dateCreated=new Date();
		}

		Account(int id1)
		{numberOfAccounts++;
		id=id1;
		dateCreated=new Date();
		}
		
		public Date getdate()
		{return dateCreated;}
		
		public int getId()
		{return id;}
		
		public double getBalance()
		{return balance;}
		
		public static double getAnnualInterestRate()
		{return annualInterestRate;}

		public static int getNumberOfObejects()
		{return numberOfAccounts;}
		
		public void changeId(int id1)
		{id=id1;}
		
		public void changeBalance(double balance1)
		{balance=balance1;}
		
		public static void changeAnnualInterestRate(double rate)
		{annualInterestRate=rate;}
		
		public void withdraw(double withdraw)
		{balance-=withdraw;
		}
		
		public void deposit(double deposit)
		{balance+=deposit;
		}
		
		public double getMonthlyInterestRate()
		{double rate=annualInterestRate/12;
		return rate;
		}
	
}
