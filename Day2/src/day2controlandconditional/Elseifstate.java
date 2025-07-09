package day2controlandconditional;

public class Elseifstate 
{
	public static void main(String[] args) 
	{
		int marks = 70;
		if(marks>=70) 
		{
			System.out.println("First class with Distinction");
		}
		else if(marks>=50 && marks<70) 
		{
			System.out.println("Pass with Distinction");
		}
		else if(marks>=35 && marks<50) 
		{
			System.out.println("Pass");
		}
		else 
		{
			System.out.println("Fail");
		}
	}

}
