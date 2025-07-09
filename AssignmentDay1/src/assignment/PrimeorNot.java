package assignment;

public class PrimeorNot 
{
	public static void main(String[] args) 
	{
		int Number = 5;
		boolean bFlag = false;
		if(Number<=1) 
		{
			System.out.println("Number is Not Prime Number");
		}
		for(int i=2;i<Number-1;i++) 
		{
			if(Number%i==0) 
			{
				bFlag = true;
			}
		}
		if(bFlag == true) 
		{
			System.out.println("Number is not prime");
		}
		else
		{
			System.out.println("NUmber is prime");
		}
	}

}
