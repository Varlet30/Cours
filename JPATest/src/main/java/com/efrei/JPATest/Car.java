package com.efrei.JPATest;

import javax.persistence.Entity;

@Entity
public class Car extends Vehicule{
	
	private int numberOfSeats;
	
	public Car() {
		super();
	}
	public Car(String platNumber, int numberOfSeats) {
		super();
		this.numberOfSeats = numberOfSeats;
	}
	public int getNumberOfSeats() {
		return numberOfSeats;

	}
	public void setNumberOfSeats(int numberOfSeats) {
		this.numberOfSeats = numberOfSeats;

	}
}