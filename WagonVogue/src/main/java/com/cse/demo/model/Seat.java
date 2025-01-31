package com.cse.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Seat {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int seatId;
	private boolean reserve;
	private String customer;
	private boolean available;
	public int getSeatId() {
		return seatId;
	}
	public void setSeatId(int seatId) {
		this.seatId = seatId;
	}
	public boolean isReserve() {
		return reserve;
	}
	public void setReserve(boolean reserve) {
		this.reserve = reserve;
	}
	public String getCustomer() {
		return customer;
	}
	public void setCustomer(String customer) {
		this.customer = customer;
	}
	public boolean isAvailable() {
		return available;
	}
	public void setAvailable(boolean available) {
		this.available = available;
	}
	@Override
	public String toString() {
		return "Seat [seatId=" + seatId + ", reserve=" + reserve + ", customer=" + customer + ", available=" + available
				+ ", getSeatId()=" + getSeatId() + ", isReserve()=" + isReserve() + ", getCustomer()=" + getCustomer()
				+ ", isAvailable()=" + isAvailable() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	public Seat(int seatId, boolean reserve, String customer, boolean available) {
		super();
		this.seatId = seatId;
		this.reserve = reserve;
		this.customer = customer;
		this.available = available;
	}
	public Seat() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}