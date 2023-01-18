import java.util.*;
public class BankAccount extends WebSystem {
protected String acc,type;

Scanner scan=new Scanner(System.in);
public BankAccount(String name, String Id,double balance, String acc) 
{
	super(name,Id,balance);
	this.acc=acc;
	this.balance=balance;
	}

public BankAccount()
{}

void openAcc()
{
	System.out.println("Enter account Number");
	acc=scan.nextLine();
	System.out.println("Enter account Type");
	type=scan.nextLine();
}
 void show()
{
	System.out.println("\nAccount Number :"+ acc
			+"\nAccount Type:"+type);
	System.out.println("Opening Balance R"+balance);
}
}
