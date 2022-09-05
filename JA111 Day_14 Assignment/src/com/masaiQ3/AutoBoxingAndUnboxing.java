package com.masaiQ3;

public class AutoBoxingAndUnboxing {
	/*
	 Java Autoboxing - Primitive Type to Wrapper Object
	In autoboxing, the Java compiler automatically converts
	 primitive types into their corresponding wrapper class.
	  objects. For example,	
		int a = 56;
	
	// autoboxing
	Integer aObj = a;
	Autoboxing has a great advantage while working with Java collections.
	
	Example 1: Java Autoboxing
	import java.util.ArrayList;
	
	class Main {
	   public static void main(String[] args) {
	
	      ArrayList<Integer> list = new ArrayList<>();
	
	      //autoboxing
	      list.add(5);
	      list.add(6);
	
	      System.out.println("ArrayList: " + list);
	   }
	}
	Run Code
	Output
	
	ArrayList: [5, 6]
	 */
/*
 Java Unboxing - Wrapper Objects to Primitive Types
 
 In unboxing, the Java compiler automatically converts wrapper class objects into their corresponding primitive types. For example,

// autoboxing
Integer aObj = 56;

// unboxing
	int a = aObj;
	Like autoboxing, unboxing can also be used with Java collections.
	
	Example 2: Java Unboxing
	import java.util.ArrayList;
	
	class Main {
	   public static void main(String[] args) {
	
	      ArrayList<Integer> list = new ArrayList<>();
	
	      //autoboxing
	      list.add(5);
	      list.add(6);
	
	      System.out.println("ArrayList: " + list);
	
	      // unboxing
	      int a = list.get(0);
	      System.out.println("Value at index 0: " + a);
	   }
	}
	Run Code
	Output
	
	ArrayList: [5, 6]
Value at index 0: 5

 */
}
