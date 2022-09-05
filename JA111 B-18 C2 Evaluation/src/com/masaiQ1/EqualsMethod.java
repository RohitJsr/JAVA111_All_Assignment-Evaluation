package com.masaiQ1;
//Q1 b)
public class EqualsMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* == Operator
	 	1) == is an operator that compares the memory
		or reference location of an object in the heap area.
		2)== operator cannot be overridden.
		3)It is majorly used to compare the reference 
		values and objects.

		// .equal()		
		1)  .equal() is a method that compares the actual content 
		of the object.
		2) It is used to compare the actual content of the object.
		3)Equals() method and can be overridden.
	
		*/
		//Here compare the actual content of the object both content 
		//are same to output is true 
//		String s1 = new String("abc");
//		String s2 = new String("abc");
//		System.out.println(s1.equals(s2));//true
		
		
		//it must be consistent (if the objects are not modified, then 
		//it must keep returning the same value).That's why StringBuilder 
		//does not override it regardless of its content.
		StringBuilder sb1 = new StringBuilder("abc");
		StringBuilder sb2 = new StringBuilder("abc");
		System.out.println(sb1.equals(sb2));//false
		
		String s1 = new String("abc");
		String s2 = new String("abc");
		System.out.println(s1==s2);//false



	}

}
