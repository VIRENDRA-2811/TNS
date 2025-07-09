package com.day5singleinheritance;

public class Citizen {
	private String name;
	private long adharno;
	private String address;
	private long phno;
	public Citizen() {
		System.out.println("Citizen object created");
	}
	public Citizen(String name, long adharno, String address, long phno) {
		super();
		this.name = name;
		this.adharno = adharno;
		this.address = address;
		this.phno = phno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getAdharno() {
		return adharno;
	}
	public void setAdharno(long adharno) {
		this.adharno = adharno;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getPhno() {
		return phno;
	}
	public void setPhno(long phno) {
		this.phno = phno;
	}
	
	
	
	
}//default constructor
