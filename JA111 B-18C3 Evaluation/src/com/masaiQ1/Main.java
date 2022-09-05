package com.masaiQ1;

import java.lang.reflect.Array;

public class Main {
	Student s1;
	public static void main(String [] args) {
		Array [] obj= new Array[4];
		Student s1=new Student();
		obj[0] = new Student(23,"rakesh",450);  
		obj[1] = new Product(91240,"HP 630");  
		obj[2] = new Product(29823,"LG OLED TV");  
		obj[3] = new Product(11908,"MI Note Pro Max 9");  
		
		
		
	}

}
