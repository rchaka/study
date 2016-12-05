package com.rchaka.car.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "\"ID\"")
	private int id;
	
	@Column(name = "\"NAME\"")
	private String name;
	@Column(name = "\"CAR\"")
	private String car;

	public Customer() {

	}

	public Customer(int id, String name, String car) {
		super();
		setId(id);
		setName(name);
		setCar(car);
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCar() {
		return car;
	}

	public void setCar(String car) {
		this.car = car;
	}
}
