package com.bookstore;

import java.util.Date;

public class Member {
	
	private int id;
	private String firstName;
	private String lastName;
	private Date birthAt;
	
	public Member(String firstName, String lastName, Date birthAt) {
		this.setFirstName(firstName);
		this.setLastName(lastName);
		this.setBirthAt(birthAt);
		this.setId(id);
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Date getBirthAt() {
		return birthAt;
	}
	public void setBirthAt(Date birthAt) {
		this.birthAt = birthAt;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}