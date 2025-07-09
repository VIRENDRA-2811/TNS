package com.day5multilevelinheritance;

public class Employee extends Person
{
	private String deptName;
	private long baseSalary;
	
	public Employee(String name, long contactNo,String deptName,long baseSalary)
	{
		super(name, contactNo);
		// TODO Auto-generated constructor stub
		this.baseSalary = baseSalary;
		this.deptName = deptName;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public long getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(long baseSalary) {
		this.baseSalary = baseSalary;
	}

	@Override
	public String toString() {
		return "Employee [deptName=" + deptName + ", baseSalary=" + baseSalary + ", toString()=" + super.toString()
				+ "]";
	}

	

	
	
	
	

}
