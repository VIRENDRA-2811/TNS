package tnsExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryMultipleCatch 
{
	public static void main(String[] args) 
	{
		int number1 = 0,number2 = 0, number3 = 0;
		Scanner sobj = new Scanner(System.in);
		try 
		{
			while(true) 
			{
				System.out.println("number1:");
				number1 = sobj.nextInt();
				
				System.out.println("number2:");
				number2 = sobj.nextInt();
				
				number3 = number1/number2;
				
				System.out.println("number3:"+number3);
			}
		}
		catch(ArithmeticException a) 
		{
//			a.printStackTrace();
			System.out.println(a.getMessage());
		}
		catch(InputMismatchException i) 
		{
			System.out.println(i.getMessage());
		}
		
	}

}
