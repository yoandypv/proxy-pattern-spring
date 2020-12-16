package com.sacavix.spring.proxy.jdk;

public class ProductDaoImpl implements ProductDao {
	
	public Product findById(Long id) {
		System.out.println("Finding product with id = " + id);
		return new Product(id, "Sample");
	}
	
	public Product save(Product product) {
		System.out.println("Saving product ...." );
		return product;
	}

}
