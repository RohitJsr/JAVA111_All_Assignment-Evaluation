package com.masaiQ1;

import java.util.ArrayList;
import java.util.ListIterator;

public class TraverseArrayList {
	
	public static void main(String[] args) {
		ArrayList<String> insert= new ArrayList<>();
		insert.add("Mango");
		insert.add("Orange");
		insert.add("Banana");
		insert.add("Grapes");
		insert.add("Apple");
		System.out.println("Arraylist"+insert);
		
		
		
		System.out.println("\n"+"Iterating over arraylist using for loop");
		for(int i=0;i<insert.size();i++) {
			System.out.print(insert.get(i));
			System.out.print(", ");
						
		}
		System.out.println("\n"+"\n"+"Iterating over arraylist using for each loop");

		for(String i: insert) {
			
			System.out.print(i);
			System.out.print(", ");
		}
		
		ListIterator<String> iterate= insert.listIterator();
		System.out.println("\n"+"\n"+"Using listIterator iterate ");
		
		while(iterate.hasNext()) {
			System.out.print(iterate.next()+", ");
		}
		
		
		
	}

}
