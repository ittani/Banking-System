import java.util.Scanner;

public class ATM {

	public static void main(String[] args) {
		BankAccount mod1= new BankAccount();
		Scanner scan = new Scanner(System.in);
		System.out.println("enter customer name");
		String nam=scan.next();
		System.out.println("enter customer ID");
		String Idn=scan.next();
		 mod1.openAcc();
			System.out.println("Enter opening Balance");
			double bal=scan.nextDouble();
		WebSystem mod= new WebSystem(nam,Idn,bal);

       
        mod1.show();
		mod.menu();

	}

}
