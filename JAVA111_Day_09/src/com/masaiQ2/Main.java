package com.masaiQ2;

public class Main {
	public static void main(String []args) {
		//create an array of Animal class with size 3
		//initialise all 3 elements of this Animal class with
		//Dog, Cat and Tiger class object.
		//call the all methods (eat,walk,makeNoise) from all
		//the 3 objects.
		// [] arr =new int[3];
		Animal[] a1=new Animal[3];
		a1[0]=new Dog();
		a1[1]= new Cat();
		a1[2]= new Tiger();
		
		a1[0].eat();
		a1[0].makeNoise();
		a1[0].walk();
		
		a1[1].eat();
		a1[1].makeNoise();
		a1[1].walk();
		
		a1[2].eat();
		a1[2].makeNoise();
		a1[2].walk();
	
		
		
		
	}

	
}
