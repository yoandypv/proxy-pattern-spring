package com.sacavix.spring.proxy.cglib;

public class Sale {
	
	private float price;
	private String reason;
	
	public Sale() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Sale(float price, String reason) {
		super();
		this.price = price;
		this.reason = reason;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	
	
}
