package com.masaiQ4;

import java.util.Scanner;

public class Factorial {
	static int factorial(int n) {
		if(n==1)
			return 1;
		else {
			return (n*factorial(n-1));
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);
		 System.out.println("Enter num");
		int num=scanner.nextInt();
		System.out.println(factorial(num));

	}

}
