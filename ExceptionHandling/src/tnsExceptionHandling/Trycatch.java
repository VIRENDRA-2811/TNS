package tnsExceptionHandling;

public class Trycatch 
{
	public static void main(String[] args) 
	{
		int x = 10;
		try 
		{
			x = x/0;
		}
		catch(ArithmeticException a) 		//Arithmetic Exception
		{
			System.out.println(a.getMessage());
		}
		
	}

}
