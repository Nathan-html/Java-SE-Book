package com.bookstore;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// global elements
		Scanner req = new Scanner(System.in);
		
		Member admin = new Member("nathan", "flacher", LocalDate.of(2002, 9, 22) );
		Member curentUser = admin;
		
		List<Object> users = new ArrayList<Object>();
		users.add(new Member("charles", "zbliat", LocalDate.of(1987, 5, 16)));
		users.add(admin);
		
		List<Object> books = new ArrayList<Object>();
		books.add(new Book("book1", LocalDate.of(2000, 1, 01)));
		
		// login or sign in
		System.out.println(
			"-------------------------------------------\r\n"+
			"  Bienvenu chez la librairie de St Denis	\r\n"+
			"-------------------------------------------\r\n");
		
		while(true) {
			
			System.out.println("Shouaitez-vous :\r\nVous connecté ? ou\r\nVous inscrir ?\r\n");
			String choose = req.next();
			
			if(choose.equals("con")||
			   choose.equals("connect")) {
				
				System.out.println("tape your_first_name-your_last_name_r\nExample : nathan-flacher");
				String userName = req.next();
				
				if(users.contains(userName)) {
					System.out.println("yes");
					break;
				}
			}
			
			else if(choose.equals("inscrir")) {
				break;
			}
			
			else if(choose.equals("skip")){ break; }
			
		}
		
		
		// Actions
		// • Lister books
		// • Create an book
		// • Borrow an book
		// • Ramener an book
		// • Chercher les livres empruntés entre deux dates saisies

		while(true) {
			
			System.out.println(
				"que shouaitez vous faire ?\r\n"+
				" * lister les livres\r\n"+
				" * crée un livre\r\n"+
				" * emprunter un livre\r\n"+
				" * ramener un livre\r\n"+
				" * liste d'emprunter\r\n");
			
			String choose = req.next();
			
			if(choose.equals("lister")){
				System.out.println("test");
				for(Object x : books) {
					System.out.println(x.toString());
				}
			}
			else if(choose.equals("create")||
					choose.equals("crée")) {
			}
			else if(choose.equals("borrow")||
					choose.equals("emprunter")) {
			}
			
		}

	}

}
