package com.techelevator;

import java.util.ArrayList;
import java.util.List;

public class Student extends Person {
	char status;
	String cohort;
	String type;
	double tuition;
	double tuitionBalance;
	boolean graduated;
	List<String> notesComments = new ArrayList<String>();
	
	public Student(String firstName, String lastName,  char gender, char status){
		super(firstName, lastName, gender);
		
	}
	
	public char getStatus() {
		return status;
	}
	public void setStatus(char status) {
		this.status = status;
	}
	public String getCohort() {
		return cohort;
	}
	public void setCohort(String cohort) {
		this.cohort = cohort;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public double getTuition() {
		return tuition;
	}
	public void setTuition(double tuition) {
		this.tuition = tuition;
	}
	public double getTuitionBalance() {
		return tuitionBalance;
	}
	public void setTuitionBalance(double tuitionBalance) {
		this.tuitionBalance = tuitionBalance;
	}
	public boolean isGraduated() {
		return graduated;
	}
	public void setGraduated(boolean graduated) {
		this.graduated = graduated;
	}
	public List<String> getNotesComments() {
		return notesComments;
	}
	public void setNotesComments(List<String> notesComments) {
		this.notesComments = notesComments;
	}
}
