import java.util.*;
public class WebSystem {
	private double balance, Trans;
	private String Id, name;

	public WebSystem(String name,String Id)
	{
		this.name=name;
		this.Id=Id;
		}

	void deposit(double amount)
	{
	if(amount!=0)
	{
	  balance+=amount;
	  Trans=amount;
	}
	}

	void withdraw(double amount)
	{ if(amount!=0 && balance>amount)
	{
		balance-=amount;
		Trans-=amount;
		}
	else if(amount>balance)
	{
		System.out.println("Insufficient Balance, please try another amount");}
		}

	void getTrans()
	{
		if(Trans>0)
		{
		System.out.println("R"+Trans+" was made");
		
		}
		else if(Trans<0)
		{
			System.out.println("R"+Trans +" was made");
			
		}
		else
		{
			System.out.println("No transactions occured");
		}
		}

	void menu()
	{
		Scanner scan = new Scanner(System.in);
		char option;
		System.out.println("\n\"Welcome\": "+ name);
		System.out.println("ID: "+Id);
		System.out.println("\n");
		
		
		do {
			System.out.println("a) Check Balance");
			System.out.println("b) Deposit ");
			System.out.println("c) Withdraw");
			System.out.println("d) Previous Transcation");
			System.out.println("e) Exit");
			
			System.out.println("\n");
			System.out.println("Choose an option");
			option=scan.next().charAt(0);
			System.out.println("\n");
			
		switch(option)
		{
		case 'a':
			System.out.println("........................");
			System.out.println("Balance R="+balance);
			System.out.println("........................");
			System.out.println("\n");
			break;
		case 'b':
			System.out.println("........................");
			System.out.println("Enter the amount");
			System.out.println("........................");
			double in=scan.nextDouble();
			deposit(in);
			System.out.println("\n");
			break;
		case 'c':
			System.out.println("........................");
			System.out.println("Enter the amount");
			System.out.println("........................");
			double out=scan.nextDouble();
			withdraw(out);
			System.out.println("\n");
			break;
		case 'd':
			System.out.println("........................");
			System.out.println("Previous Transactions");
			System.out.println("........................");
			getTrans();	
			System.out.println("\n");
			break;
		case 'e':
			System.out.println("........................");
			break;
	   default:
		   System.out.println("Choose option to proceed");
		   break;
		} 
		}while(option !='e');
	System.out.println("Thank you for using our banking service");
		}
}
