package atm;
import java.util.*;

public class AtmSystem 
{
	public static void main(String[] args) 
	{
		int bal = 100000;
				
		System.out.println("Enter Choice from 1 to 3");
		System.out.println("1 to deposit amount into account");
		System.out.println("2 to debit amount from account");
		System.out.println("3 to check the balance");
		System.out.println("4 to exit");
		
		while(true) 
		{
			Scanner cobj = new Scanner(System.in);
			int choice = cobj.nextInt();
		
			switch(choice) 
			{
			case 1:
				int deposit  = 0;
				System.out.println("Enter the amount you want to deposit");
				Scanner dobj = new Scanner(System.in);
				deposit = dobj.nextInt();
				
				bal = bal + deposit;
				System.out.println("amount deposit successfully");
				break;
			case 2:
				int withdraw  = 0;
				System.out.println("Enter the amount you want to withdraw");
				Scanner wobj = new Scanner(System.in);
				withdraw = wobj.nextInt();
				
				bal = bal - withdraw;
				System.out.println("amount withdraw successfully");
				break;
			case 3:
				System.out.println("Your Balance is:"+bal);
				break;
			case 4:
				System.out.println("Thanks for using JAVA ATM SYSTEM");
				break;
			default:
				System.out.println("Enter valid option");
			}
		}
		
		
		
		
		
	}
}
