
public class Exercise11_3 
{

}


class CheckingAccount extends Account
{protected double overdraft_limit;
	public CheckingAccount(){}
	
	public CheckingAccount(int id,double limit)
	{super(id);
	overdraft_limit=limit;	
	}

	public void withdraw(double withdraw)
	{if(this.getBalance()+overdraft_limit>=withdraw)
		this.changeBalance(this.getBalance()-withdraw);
	else System.out.print("Sorry. It's beyond your overdraft limit.");
	}
}


class SavingAccount extends Account
{	public SavingAccount(){}

	public SavingAccount(int id)
	{super(id);}

	public void withdraw(double withdraw)
	{if(this.getBalance()>=withdraw)
	this.changeBalance(this.getBalance()-withdraw);
	else System.out.print("Sorry. You don't have this much money.");
	}
}