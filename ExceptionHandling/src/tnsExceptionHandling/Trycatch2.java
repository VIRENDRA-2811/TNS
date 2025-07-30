package tnsExceptionHandling;

public class Trycatch2 
{
	public static void main(String[] args) 
	{
		int arr[] = {1,5,6,4,7};
		try 
		{
			System.out.println(arr[5]);
		}
		catch(ArrayIndexOutOfBoundsException a) 
		{
			System.out.println(a.getMessage());
		}
		
 	}

}
