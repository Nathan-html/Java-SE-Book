package com.bookstore;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Book {
	
	private String title;
	private LocalDate releaseDate;
	private List<String> listOfLoans = new ArrayList<String>();
	 
	public Book(String title, LocalDate releaseDate) {
		this.title = title;
		this.releaseDate = releaseDate;
	}
	 
	public String getTitle() {
		return title;
	}
	public LocalDate getReleaseDate() {
		return releaseDate;
	}

	public List<String> getListOfLoans() {
		return listOfLoans;
	}

	public void setListOfLoans(List<String> listOfLoans) {
		this.listOfLoans = listOfLoans;
	}
	
}
