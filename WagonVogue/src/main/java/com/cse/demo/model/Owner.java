package com.cse.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class Owner {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int ownerId;
		private String name;
		private String user;
		private String address;
		private int phonenumber;
		private String emailid;
		private int dob;
		private String password;
		public int getOwnerId() {
			return ownerId;
		}
		public void setOwnerId(int ownerId) {
			this.ownerId = ownerId;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public int getPhonenumber() {
			return phonenumber;
		}
		public void setPhonenumber(int phonenumber) {
			this.phonenumber = phonenumber;
		}
		public String getEmailid() {
			return emailid;
		}
		public void setEmailid(String emailid) {
			this.emailid = emailid;
		}
		public int getDob() {
			return dob;
		}
		public void setDob(int dob) {
			this.dob = dob;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public String getUser() {
			return user;
		}
		public void setUser(String user) {
			this.user = user;
		}
		@Override
		public String toString() {
			return "Owner [ownerId=" + ownerId + ", name=" + name + ", address=" + address + ", phonenumber="
					+ phonenumber + ", emailid=" + emailid + ", dob=" + dob + ", shopname=" + password + ", category="
					+ user + ", getOwnerId()=" + getOwnerId() + ", getName()=" + getName() + ", getAddress()="
					+ getAddress() + ", getPhonenumber()=" + getPhonenumber() + ", getEmailid()=" + getEmailid()
					+ ", getDob()=" + getDob() + ", getShopname()=" + getPassword() + ", getCategory()=" + getUser()
					+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
					+ "]";
		}
		public Owner(int ownerId, String name, String address, int phonenumber, String emailid, int dob,
				String password, String user) {
			super();
			this.ownerId = ownerId;
			this.name = name;
			this.user = user;
			this.address = address;
			this.phonenumber = phonenumber;
			this.emailid = emailid;
			this.dob = dob;
			this.password = password;
		}
		public Owner() {
			super();
			// TODO Auto-generated constructor stub
		}

}
