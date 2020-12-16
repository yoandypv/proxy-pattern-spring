package com.sacavix.spring.proxy.jdk;

public class Product {
	
	private Long id;
	private String nombre;
	
	public Product(Long id, String nombre) {
		super();
		this.id = id;
		this.nombre = nombre;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", nombre=" + nombre + "]";
	}
}
