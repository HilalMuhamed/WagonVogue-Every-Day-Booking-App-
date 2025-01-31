package com.cse.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int customerId;
	private String name;
	private String user;
	private int phoneNumber;
	private String emailId;
	private int dob;
	private String address;
	private String password;
	//private Order order;
	public int getCustomerId() {
		return customerId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	
	public int getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public int getDob() {
		return dob;
	}
	public void setDob(int dob) {
		this.dob = dob;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", name=" + name + ", phoneNumber=" + phoneNumber + ", emailId="
				+ emailId + ", dob=" + dob + ", address=" + address + ", getCustomerId()=" + getCustomerId()
				+ ", getName()=" + getName() + ", getPhoneNumber()=" + getPhoneNumber() + ", getEmailId()="
				+ getEmailId() + ", getDob()=" + getDob() + ", getAddress()=" + getAddress() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	public Customer(String name, String user, int phoneNumber, String emailId, int dob, String address, String password) {
		super();
		this.name = name;
		this.user = user;
		this.phoneNumber = phoneNumber;
		this.emailId = emailId;
		this.dob = dob;
		this.address = address;
		this.password = password;
	}
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}


}
