package com.masaiQ4;

import java.util.Scanner;



public class Main5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Test t=new Test();
		//Take this argument from user using the Scanner class
		//Write the logic to print the elements
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		
		int amt=sc.nextInt();
		int[] arr= t.display(amt);
		
	
	}

}
