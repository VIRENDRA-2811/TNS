package com.day5multilevelinheritance;

public class MultiLevelMain 
{
	public static void main(String[] args) 
	{
		Person p1 = new Person("Sujal",9865121445L);
		
		System.out.println(p1);
		
		p1 = new Employee("A",8978451232L,"Sales",67890);
		
		System.out.println(p1);
		
		p1 = new Level1("S",8978451214L,"Marketing",10000L,100,"Security");
		
		System.out.println(p1);
	}

}
