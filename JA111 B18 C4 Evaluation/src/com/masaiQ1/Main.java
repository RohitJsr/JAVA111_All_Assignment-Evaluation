package com.masaiQ1;


import java.util.ArrayList;
import java.util.List;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		List<Book> booksCollection = new ArrayList<>();
		
		
		
		booksCollection.add(new Book(1,"Name1","Author1"));
		booksCollection.add(new Book(2,"Name2","Author1"));
		booksCollection.add(new Book(3,"Name1","Author1"));
		booksCollection.add(new Book(1,"Name4","Author2"));

		
		
		
		Library lib = new Library();
		
		for (int i = 0; i < booksCollection.size(); i++) {
			
			lib.addBooks(booksCollection.get(i));
			
			
		}
		
		for (int i = 0; i < lib.books.size(); i++) {
			
			
			Book bb = lib.books.get(i);
			bb.book();
			
		}

	}

}
