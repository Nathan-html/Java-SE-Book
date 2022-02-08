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
	
	public String toString() {
		String msg = "\r\n";
		for(Object x : listOfLoans) {
			msg = msg + "    {" + x + "},\r\n";
		}
		return "{\r\n  title:"+ this.getTitle() + ", \r\n" +
			   "  releaseDate:" + this.getReleaseDate() + ", \r\n" +
			   "  listOfLoans: {" + msg +
			   "},";
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

	public void setListOfLoans(String string) {
		this.listOfLoans.add(string);
	}
	
}
