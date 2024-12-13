package com.encapsulation;

public class Encapsulation {

	private String firstName;
	private String lastName;
	private int id;
	private int marks;
	
	public Encapsulation(String firstName,String lastName, int id, int marks) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.id = id;
		this.marks = marks;
	}
	
	//Getter and Setter for the private variable firstName
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstNameText) {
		this.firstName= firstNameText;
	}
	
	//Getter and Setter for the private variable lastName
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastNameText) {
		this.lastName = lastNameText;
	}
	
	//Getter and Setter for the private variable ID
	public int getId() {
		return id;
	}
	public void setId(int idValue) {
		this.id = idValue; 
	}
	
	//Getter and Setter for the private variable Marks
    public int getMarks() {
    	return marks;
    }
    public void setMarks(int marksValue) {
    	this.marks = marksValue;
    }
}
