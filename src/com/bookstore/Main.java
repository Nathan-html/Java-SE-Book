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
		
		Book book1 = new Book("book1", LocalDate.of(2000, 1, 01));
		book1.setListOfLoans(admin.getFirstName());
		
		List<Object> books = new ArrayList<Object>();
		books.add(book1);
		
		
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
				
				System.out.println("taper your_first_name-your_last_name_r\nExample : nathan-flacher");
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
				"Que shouaitez vous faire ?\r\n"+
				" * lister les livres\r\n"+
				" * crée un livre\r\n"+
				" * emprunter un livre\r\n"+
				" * ramener un livre\r\n"+
				" * liste d'emprunter\r\n");
			
			String choose = req.next();
			
			if(choose.equals("list")||
			choose.equals("liste")||
			choose.equals("lister")){
				for(Object x : books) {
					System.out.println(x.toString());
				}
			}
			
			else if(choose.equals("create")||
					choose.equals("crée")) {
				System.out.println("le titre du livre");
				String title = req.next();
				System.out.println("l'année de la sortie");
				int year = req.nextInt();
				System.out.println("le mois");
				int mouth = req.nextInt();
				System.out.println("le jour");
				int day = req.nextInt();
				books.add(new Book(title, LocalDate.of(year, mouth, day)));
				System.out.println("livre crée");
			}
			else if(choose.equals("borrow")||
					choose.equals("emprunter")) {
			}
			System.out.println("\r\n--------------------------------------\r\n");
			
		}

	}

}
