package com.cse.demo.model;

import java.time.LocalDate;
import java.time.LocalTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Reserve {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int orderId;
	private LocalTime time1;
	private LocalTime time2;
	private LocalDate date;
	private int seats;
	private int price;
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public LocalTime getTime1() {
		return time1;
	}
	public void setTime1(LocalTime time1) {
		this.time1 = time1;
	}
	public LocalTime getTime2() {
		return time2;
	}
	public void setTime2(LocalTime time2) {
		this.time2 = time2;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public int getSeats() {
		return seats;
	}
	public void setSeats(int seats) {
		this.seats = seats;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", time1=" + time1 + ", time2=" + time2 + ", date=" + date + ", seats="
				+ seats + ", price=" + price + ", getOrderId()=" + getOrderId() + ", getTime1()=" + getTime1()
				+ ", getTime2()=" + getTime2() + ", getDate()=" + getDate() + ", getSeats()=" + getSeats()
				+ ", getPrice()=" + getPrice() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
	public Reserve(LocalTime time1,LocalTime time2, LocalDate date, int seats, int price) {
		super();
		
		this.time1=time1;
		this.time2=time2;
		this.date=date;
		this.seats=seats;
		this.price=price;
		
	}
	public Reserve() {
		super();
	}
}