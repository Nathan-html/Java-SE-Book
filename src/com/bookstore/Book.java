package com.bookstore;

import java.time.LocalDate;

public class Book {
	
	private String title;
	private LocalDate releaseDate;
	 
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
	
}
