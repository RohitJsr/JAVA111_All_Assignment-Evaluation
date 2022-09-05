package com.masaiQ1;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//Write logic to get numberOfPassenger and numberOfKms
		System.out.println("Enter Number of km");
		int numofKm=scanner.nextInt();
		
		
		System.out.println("Enter Number of pasasenge");
		int numofpassenger=scanner.nextInt();
		
		//int numberOfKms=scanner.nextInt();
		Ola myOla = new Ola();
		//Car myCar = myOla.bookCar(numberOfKms, numofKm);
	//	int res = myOla.calculateBill(myCar);
	//	System.out.println("The total fare amount is"+ res);
	}
}
