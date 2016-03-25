import java.util.ArrayList;


public class Exercise11_8 
{	public static void main (String[] args) 
	{TradingAccount account = new TradingAccount("George", 1122, 1000.0);
    TradingAccount.changeAnnualInterestRate(1.5);
    account.deposit(30);
    account.deposit(40);
    account.deposit(50);
    
    account.withdraw(5);
    account.withdraw(4);
    account.withdraw(2);
    
    System.out.println("Name: " + account.getName());
    System.out.println("Annual interest rate: " + TradingAccount.getAnnualInterestRate());
    System.out.println("Balance: " + account.getBalance());
    
    ArrayList<Transaction> list = account.getTransactions();
    
    System.out.printf("%-35s%-15s%-15s%-15s\n", "Date", "Type", "Amount", "Balance");
    
    for (int i = 0; i < list.size(); i++) {
      Transaction transaction = (Transaction)(list.get(i));
      System.out.printf("%-35s%-15s%-15s%-15s\n", transaction.getDate(), 
          transaction.getType(), transaction.getAmount(), transaction.getBalance());
    }

	}
}




