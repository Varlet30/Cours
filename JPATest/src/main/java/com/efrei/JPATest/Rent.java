package com.efrei.JPATest;

import java.util.Date;
import javax.persistence.Entity;

@Entity
public class Rent {
	
	private Date beginRent;
	private Date endRent;
	
	public Rent() {
		super();
	}
	public Rent(Date beginRent, Date endRent) {
		super();
		this.beginRent = beginRent;
		this.endRent = endRent;
	}
	public void setBeginRent(Date beginRent) {
		this.beginRent = beginRent;
	}	
	public Date getBeginRent() {
		return beginRent;
	}
	public void setEndRent(Date endRent) {
		this.endRent = endRent;
	}
	public Date getEndRent() {
		return endRent;

	}
}