package day2controlandconditional;

public class Nestedif 
{
	public static void main(String[] args) 
	{
		int a = 10;
		int b = 30;
		int c = 20;
		if(a>b) 
		{
			if(a>c) 
			{
				System.out.println("A is Greater");
			}
			else 
			{
				System.out.println("C is Greater");
			}
		}
		else 
		{
			if(b>c) 
			{
				System.out.println("B is Greater");
			}
			else 
			{
				System.out.println("C is greater");
			}
		}
	}

}
