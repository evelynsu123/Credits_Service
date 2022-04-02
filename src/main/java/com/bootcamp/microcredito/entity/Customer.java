package com.bootcamp.microcredito.entity;

public class Customer {
	private String name;
	private String lastName;
	private String dni;
	private String type;
	
	public Customer() {
		super();
	}
	public Customer(String name, String lastName, String dni, String type) {
		super();
		this.name = name;
		this.lastName = lastName;
		this.dni = dni;
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
}
