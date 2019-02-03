package com.efrei.JPATest;

import javax.persistence.Entity;

@Entity
public class Vehicule {
	
	private String platNumber;
	
	public Vehicule() {
		super();
	}
	public Vehicule(String platNumber) {
		super();
		this.platNumber = platNumber;
	}
	public String getPlatNumber() {
		return platNumber;
	}
	public void setPlatNumber(String platNumber) {
		this.platNumber = platNumber;
	}
}