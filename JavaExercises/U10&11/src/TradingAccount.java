import java.util.ArrayList;


public class TradingAccount extends Account
{String name;
ArrayList<Transaction> transactions=new ArrayList<Transaction>();

	public TradingAccount(){};

	public TradingAccount(String name,int id,double balance)
	{super(id);
	this.changeBalance(balance);
	this.name=name;
	}
	
	public void withdraw(double amount) 
	{this.changeBalance(this.getBalance()-amount);
	 transactions.add(new Transaction('W', amount, this.getBalance(), ""));
	}

	public void deposit(double amount)
	{this.changeBalance(this.getBalance()+amount);
	 transactions.add(new Transaction('D', amount, this.getBalance(), ""));
	}
	
	public ArrayList<Transaction> getTransactions() 
	{return transactions;}

	public String getName() 
	{return name;}
}


class Transaction
{	  private java.util.Date date;
	  private char type;
	  private double amount;
	  private double balance;
	  private String description;
	  
	  public Transaction(char type, double amount, double balance,
	      String description) 
	  { date = new java.util.Date();
	    this.type = type;
	    this.amount = amount;
	    this.balance = balance;
	    this.description = description;
	  }

	  public java.util.Date getDate()
	  {return date;}
	  
	  public char getType() 
	  {return type;}

	  public double getAmount() 
	  {return amount;}
	  
	  public double getBalance() 
	  {return balance;}
	  
	  public String getDescription() 
	  {return description;}
	}
