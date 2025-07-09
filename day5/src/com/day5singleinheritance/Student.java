package com.day5singleinheritance;

public class Student extends Citizen {
	private int roll_no;
	private String collegeName;
	public Student() {
		super();
	}
	public Student(String name, long adharno, String address, long phno,int roll_no, String collegeName) {
		super(name,adharno,address,phno);
		this.roll_no = roll_no;
		this.collegeName = collegeName;
	}
	public int getRoll_no() {
		return roll_no;
	}
	public void setRoll_no(int roll_no) {
		this.roll_no = roll_no;
	}
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	@Override
	public String toString() {
		return "Student [roll_no=" + roll_no + ", collegeName=" + collegeName + ", getName()=" + getName()
				+ ", getAdharno()=" + getAdharno() + ", getAddress()=" + getAddress() + ", getPhno()=" + getPhno()
				+ "]";
	}
	

}
