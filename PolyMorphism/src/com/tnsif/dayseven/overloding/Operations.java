package com.tnsif.dayseven.overloding;

// Program to define overloded methods for palindrome check.
public class Operations 
{
	public static boolean isPalindrome(int number) 
	{
		int rev = 0;
		int dummyNumber = number;
		
		while(number != 0) 
		{
			rev = rev*10+number%10;
			number /= 10;
		}
		return dummyNumber==rev;
	}
	
//	Check whether String is palindrome or not
	
	public static boolean isPlaindrome(String str) 
	{
		String rev;
		rev = new StringBuffer(str).reverse().toString();
		return str.equals(rev);
	}

}
