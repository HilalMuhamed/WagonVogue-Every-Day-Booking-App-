package com.cse.demo.model;

import java.time.LocalTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;

@Entity
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String services;
	private double rate;
	private String features;
	private float rating;
	private int seats;
	private  LocalTime timein;
	private LocalTime timeout;
	@Lob
	private byte[] image;
	public byte[] getImage() {
		return image;
	}

	public void setImage(byte[] image) {
		this.image = image;
	}

	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getServices() {
		return services;
	}
	public void setServices(String services) {
		this.services = services;
	}
	public double getRate() {
		return rate;
	}
	public void setRate(double rate) {
		this.rate = rate;
	}
	public String getFeatures() {
		return features;
	}
	public void setFeatures(String features) {
		this.features = features;
	}
	public float getRating() {
		return rating;
	}
	public void setRating(float rating) {
		this.rating = rating;
	}
	public int getSeats() {
		return seats;
	}
	public void setSeats(int seats) {
		this.seats = seats;
	}
	public LocalTime getTimein() {
		return timein;
	}
	public void setTimein(LocalTime timein) {
		this.timein = timein;
	}
	public LocalTime getTimeout() {
		return timeout;
	}
	public void setTimeout(LocalTime timeout) {
		this.timeout = timeout;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", services=" + services + ", rate=" + rate + ", features="
				+ features + ", rating=" + rating + ", seats=" + seats + ", timein=" + timein + ", timeout=" + timeout
				+ ", getId()=" + getId() + ", getName()=" + getName() + ", getServices()=" + getServices()
				+ ", getRate()=" + getRate() + ", getFeatures()=" + getFeatures() + ", getRating()=" + getRating()
				+ ", getSeats()=" + getSeats() + ", getTimein()=" + getTimein() + ", getTimeout()=" + getTimeout()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	public Product(int id, String name, String services, double rate, String features, float rating, int seats,
			LocalTime timein, LocalTime timeout) {
		super();
		this.id = id;
		this.name = name;
		this.services = services;
		this.rate = rate;
		this.features = features;
		this.rating = rating;
		this.seats = seats;
		this.timein = timein;
		this.timeout = timeout;
	}
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
//<c:forEach var="i" begin="1" end="${product.seats}">
//<input type="checkbox" id="seat${i}" name="seat" value="${i}">
//<label for="seat${i}">Seat ${i}</label><br>
//</c:forEach>