package com.techelevator;

import java.util.Date;

public class Staff extends Person {
	char status;
	String role;
	String type;
	double compensationRate;
	Date startDate;
	Date endDate;
	boolean active;

	Staff(String firstName, String lastName, char gender, Date startDate) {
		super(firstName, lastName, gender);
		
	}

	
	public char getStatus() {
		return status;
	}

	public void setStatus(char status) {
		this.status = status;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getCompensationRate() {
		return compensationRate;
	}

	public void setCompensationRate(double compensationRate) {
		this.compensationRate = compensationRate;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public void applyTuitionPayment(double payment) {
}
	
}
