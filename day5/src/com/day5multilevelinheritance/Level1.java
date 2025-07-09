package com.day5multilevelinheritance;

public class Level1 extends Employee
{
	private int noofShares;
	private String authority;
	
	public Level1(String name, long contactNo, String deptName, long baseSalary,int noofShares,String authority) {
		super(name, contactNo, deptName, baseSalary);
		
		this.noofShares = noofShares;
		this.authority = authority;
	}

	public int getNoofShares() {
		return noofShares;
	}

	public void setNoofShares(int noofShares) {
		this.noofShares = noofShares;
	}

	public String getAuthority() {
		return authority;
	}

	public void setAuthority(String authority) {
		this.authority = authority;
	}

	@Override
	public String toString() {
		return "Level1 [noofShares=" + noofShares + ", authority=" + authority + ", toString()=" + super.toString()
				+ "]";
	}
	
	
}
