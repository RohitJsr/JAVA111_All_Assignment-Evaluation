package com.masaiQ2;

import java.util.Scanner;

public class Demo {
	
	public Hotel provideFood(int amount) {
		
		if(amount>1000) {
			
			TajHotel tajhotel=new TajHotel();
			
			return tajhotel;
		}else if(amount>200||amount<=1000) {
			
			RoadSideHotel roadsidehotel =new RoadSideHotel();
			
			return roadsidehotel;
			
		}
		
		return null;
		
	}
	
	//write the logic if the supplied amount is more than 1000 then return
	//the object of TajHotel class
	//if the supplied amount is greater than 200 and less than 1000 then
//	return the object of RoadSideHotel class
	
	
	public static void main(String [] args) {
			
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the amount");
		
		int amt=sc.nextInt();
		
		Demo d1=new Demo();
		
		Hotel myobj=d1.provideFood(amt);
		
		if(myobj instanceof TajHotel) {
			
			myobj.chickenBiryani();
			myobj.chickenBiryani();
			((TajHotel) myobj).welcomeDrink();
			
		}else if(myobj instanceof RoadSideHotel) {
			myobj.chickenBiryani();
			myobj.chickenBiryani();
		}
		else {
			System.out.println("Enter Valid Amount");
		}
		
	}
	

}
