package com.tnsif.dayseven.overloding;

public class Executer
{
	public static void main(String[] args) 
	{
		System.out.println("Is 121 palindrome"+Operations.isPalindrome(121));
		System.out.println("Is 123 palindrome"+Operations.isPalindrome(123));
		
		System.out.println("Is CAR palindrome"+Operations.isPlaindrome("CAR"));
		System.out.println("Is RACECAR palindrome"+Operations.isPlaindrome("RACECAR"));
	}
}
