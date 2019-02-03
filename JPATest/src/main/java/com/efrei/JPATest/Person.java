package com.efrei.JPATest;

import javax.persistence.Entity;

@Entity
public class Person {
	
	private String name;
	
	public Person() {
		super();
	}
	public Person(String name) {
		super();
		this.name = name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
}