package com.masaiQ1;

public class Ola {

	public Car bookCar(int numberOfPassenger, int numberOfKMs) {
		
		if(numberOfPassenger<=3) {
			HatchBack hb =new HatchBack();
			return hb;
		}
		else {
			Sedan sd =new Sedan();
			
			return sd;

		}
	}
	//public int calculateBill(Car car) {
	//	Total fare=numberOfKms*farePerKm
	//}

}
