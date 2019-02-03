package com.efrei.JPATest;

import javax.persistence.Entity;

@Entity
public class Van extends Vehicule{
	
	private int maxWeight;
	
	public Van() {
		super();
	}
	public Van(String platNumber, int maxWeight) {
		super();
		this.maxWeight = maxWeight;
	}
	public int maxWeight() {
		return maxWeight;

	}
	public void setmaxWeight(int maxWeight) {
		this.maxWeight = maxWeight;

	}
}