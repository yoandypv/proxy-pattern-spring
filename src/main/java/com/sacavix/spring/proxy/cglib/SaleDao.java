package com.sacavix.spring.proxy.cglib;

public class SaleDao {
	
	public Sale findById(Long id) {
		System.out.println("Finding sale with id = " + id);
		return new Sale(id, "Good sale");
	}
	
	public Sale save(Sale sale) {
		System.out.println("Saving sale ...." );
		return sale;
	}
}
