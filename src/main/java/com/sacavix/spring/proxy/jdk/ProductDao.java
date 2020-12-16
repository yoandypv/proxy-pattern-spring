package com.sacavix.spring.proxy.jdk;

public interface ProductDao {
	public Product findById(Long id);
	public Product save(Product product);
}
