package com.bookstore;

import java.time.LocalDate;

public class Member {
	
	private int id;
	private String name;
	private String firstName;
	private String lastName;
	private LocalDate birthAt;
	
	public Member(String firstName, String lastName, LocalDate birthAt) {
		this.name = this.getFirstName()+"-"+this.getLastName();
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
	public LocalDate getBirthAt() {
		return birthAt;
	}
	public void setBirthAt(LocalDate birthAt) {
		this.birthAt = birthAt;
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
}