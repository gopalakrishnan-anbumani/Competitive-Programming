package com.java.basics;

public class Team {
	
	private String address;
	private String name;
	private int phoneNo;
	private int empId;
	private String dept;
	private String rating;
	
	public Team(String address, String name, int phoneNo, int empId, String dept) {
		this.address = address;
		this.name = name;
		this.phoneNo = phoneNo;
		this.empId = empId;
		this.dept = dept;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(int phoneNo) {
		this.phoneNo = phoneNo;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}
	
	

}
