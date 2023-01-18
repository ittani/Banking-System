import java.util.Scanner;

public class ATM {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter customer name");
		String nam=scan.next();
		System.out.println("enter customer ID");
		String Idn=scan.next();
		WebSystem mod= new WebSystem(nam,Idn);
		mod.menu();

	}

}
