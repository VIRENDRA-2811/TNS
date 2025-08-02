package tnsExceptionHandling;
import java.util.InputMismatchException;
import java.util.Scanner;

public class FinallyBlock 
{
	public static void main(String[] args) 
	{
		Scanner sobj = new Scanner(System.in);
		
		try {
			System.out.println("Enter a number:");
			
			int Number = 0;
			Number = sobj.nextInt();
			
			System.out.println("Number:"+Number);
		}
		catch(InputMismatchException i)
		{
//			System.out.println(i.getMessage());
			System.out.println("Enter a valid Number:"+i.getMessage());
		}
		finally 
		{
			sobj.close();
			System.out.println("Scanner Class Close Sucessfully....");
		}
		
	}

}
