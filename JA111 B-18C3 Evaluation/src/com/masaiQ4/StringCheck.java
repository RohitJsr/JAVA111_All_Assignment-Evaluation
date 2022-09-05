package com.masaiQ4;

import java.util.Scanner;

public class StringCheck {
	
	public static void main(String[] args) {
		Scanner s1 =new Scanner(System.in);
		System.out.println("Enter a String =>");
		String str1=s1.nextLine();
		System.out.println("Enter a position =>");
		int num=s1.nextInt();
		
		if(num>str1.length()) {
			System.out.println("Invalid position, Please enter a valid position =>");
		}
		else
		{
		System.out.println(str1.charAt(num));
		}
		

		
		
	}

}
