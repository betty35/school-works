import java.util.Date;
import java.util.Scanner;

public class Exercise8_7
{	public static void main(String[] args)
	{Scanner input=new Scanner(System.in);
	Account account1 = new Account();
	System.out.print("Enter the id:");
	int id1=input.nextInt();
	Account account2 = new Account(id1);
	System.out.print("Enter the balance and annual interest rate");
	double balance1=input.nextDouble();
	double rate1=input.nextDouble();
	account2.changeBalance(balance1);
	account2.changeAnnualInterestRate(rate1);
	//输出账户1、2的目前的各种数值
	System.out.print("Total Accounts: "+ Account.getNumberOfObejects()+"\nAccount1:Id: "
			+account1.getId()+"  Date of Created"+ account1.getdate() +"\nBalance: "+account1.getBalance()+
					"   Annual Interest Rate: "+account1.getAnnualInterestRate()+"\n"+
					"Monthly Interest: "+account1.getMonthlyInterestRate()*account1.getBalance());
	System.out.print("\nAccount2:Id: "
			+account2.getId()+"  Date of Created\n"+ account2.getdate() +"  Balance: "+account2.getBalance()+
					"   Annual Interest Rate: "+account2.getAnnualInterestRate()+"\n"+
					"Monthly Interest: "+account2.getMonthlyInterestRate()*account2.getBalance());
	//开始修改账户2
	System.out.print("Do you want to change an id?\n"+
	"Enter 0 for no and the id you want for changing it:");
	int id2=input.nextInt();
	if(id2!=0) account2.changeId(id2);
	System.out.print("Do you want to deposit?\n"+
			"Enter 0 for no and the amount you want deposit:");
	double deposit1=input.nextDouble();
	if(deposit1!=0) account2.deposit(deposit1);
	System.out.print("Do you want to change withdraw?\n"+
			"Enter 0 for no and the amount you want to withdraw:");
	double withdraw1=input.nextDouble();
	if(withdraw1!=0) account2.withdraw(withdraw1);
	System.out.print("\nNow Account2:Id: "+account2.getId()+"  Date of Created\n"
	+ account2.getdate() +"  Balance: "+account2.getBalance()+"   Annual Interest Rate: "
	+account2.getAnnualInterestRate()+"\n"+
	"Monthly Interest: "+account2.getMonthlyInterestRate()*account2.getBalance());
	}
	
}



class Account 
{private int id=0;
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
	
	public double getAnnualInterestRate()
	{return annualInterestRate;}

	public static int getNumberOfObejects()
	{return numberOfAccounts;}
	
	public void changeId(int id1)
	{id=id1;}
	
	public void changeBalance(double balance1)
	{balance=balance1;}
	
	public void changeAnnualInterestRate(double rate)
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

