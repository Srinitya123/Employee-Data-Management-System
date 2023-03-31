package com.cts.EmployeeUI.Model;

public class Employee {

	private int empid;
	private String name;
	private String department;
	private String address;
	private String phn;
	private String email;
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhn() {
		return phn;
	}
	public void setPhn(String phn) {
		this.phn = phn;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", name=" + name + ", department=" + department + ", address=" + address
				+ ", phn=" + phn + ", email=" + email + "]";
	}
	public Employee(int empid, String name, String department, String address, String phn, String email) {
		super();
		this.empid = empid;
		this.name = name;
		this.department = department;
		this.address = address;
		this.phn = phn;
		this.email = email;
	}
	public Employee() {
		super();
	}
	
	
	
}