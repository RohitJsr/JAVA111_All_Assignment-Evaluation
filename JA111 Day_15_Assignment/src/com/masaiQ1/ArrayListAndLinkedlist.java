package com.masaiQ1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListAndLinkedlist {
	
	/*
	 ArrayList:--1)ArrayList uses a dynamic array to srore its elements.
	 2)ArrayList is slow as array manipulation is slower.
	 3)Array list implements olny list.
	 4)ArrayList is faster in sroring and accessing data.
	 
	 LinkedList:--1)LinkedList uses doubly linked list to store its elements.
	 2)Linked List is faster being node based as not much bit shifting required.
	 3)LinkedList implements list as well as queue, It can acts as a queue as well.
	 4)LinkedList is faster in manipulation of data.
	 	 
	 */
		public static void main(String[] args) {
			List<String> list=new ArrayList<>();
			list.add("A");
			list.add("B");
			list.add("C");
			list.add("D");
			
			List<String> list1=new LinkedList<>();
			list1.add("E");
			list1.add("F");
			list1.add("G");
			list1.add("H");
			
				System.out.println(list);
				System.out.println(list1);
		}
}
