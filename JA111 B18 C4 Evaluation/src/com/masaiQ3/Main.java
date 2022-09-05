package com.masaiQ3;

import java.util.ArrayList;
import java.util.List;



public class Main {
	public static void main(String[] args) {
		List<Student> list1 = new ArrayList<>();
		
		list1.add(new Student(7,"Amresh",70,55,99));
		list1.add(new Student(9,"Sonu",65,55,55));
		list1.add(new Student(8,"Amresh",72,66,78));
		list1.add(new Student(10,"Jyoti",50,88,30));


		
		 for (Student student : list1) {
	            System.out.print(student +"\n");
	        }
		
		

	}
	

}
	