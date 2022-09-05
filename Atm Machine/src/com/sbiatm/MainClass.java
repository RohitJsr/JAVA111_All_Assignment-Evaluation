package com.sbiatm;

import java.util.Scanner;

public class MainClass {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int atmnumber=12345;
		int atmpin=123;
		Scanner in = new Scanner(System.in);
		System.out.println("Welcome To ATM Machine");
		System.out.println("Enter Atm Number:");
		int atmNumber=in.nextInt();
		System.out.println("Enter Pin:");
		int pin=in.nextInt();
		if ((atmnumber==atmNumber)&&(atmpin==pin)) {
			System.out.println("Validation Done");
		}
		else {
			System.out.println("Incorrect Atm Number or Pin");
			System.exit(0);
		}
				
	}

}
