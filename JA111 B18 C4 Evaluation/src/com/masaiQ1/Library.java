package com.masaiQ1;

import java.util.ArrayList;
import java.util.List;

import com.masaiQ3.Student;

public class Library {
	
	List<Book> books = new ArrayList<>();
	
	public void addBooks(Book book) {
		
		if(!books.contains(book)) {
			
			books.add(book);
			
			
		}else {
			System.out.println("Duplicate book");
		}
	}

	

}
