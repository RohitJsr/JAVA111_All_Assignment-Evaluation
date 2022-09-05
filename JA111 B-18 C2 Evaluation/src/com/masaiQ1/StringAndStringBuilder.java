package com.masaiQ1;
 //Q1 a)
public class StringAndStringBuilder {

	public static void main(String[] args) {
		/*
		 In the string constant pool, the Hello remains unchanged,
		  and a new string object is created with HelloWorld. It 
		  shows that the strings are immutable. The reference variable 
		  points to the Hello not to the HelloWorld.
		 */
	    	String NewString = "Hello";    
	        NewString.concat("World");  
	        System.out.println(NewString);   //Hello
	        /*If we want that  HelloWorld, we have to
	        explicitly assign it to that variable. For example:
	        */
	        String NewString1 = "Hello";    
	        NewString1=NewString1.concat("World");  
	        System.out.println(NewString1);//HelloWorld
	        
	      /*
	       StringBuffer:- 1)	StringBuffer is synchronized i.e. thread safe.
	        It means two threads can't call the methods of StringBuffer 
	        simultaneously  
	        2)StringBuffer is less efficient than StringBuilder.	
	        
	        StringBuilder:- 1)StringBuilder is non-synchronized i.e. not
	         thread safe. It means two threads can call the methods of 
	         StringBuilder simultaneously.
	        2) StringBuilder is more efficient than StringBuffer.

	   			        
	       */
	        
	        StringBuffer buffer=new StringBuffer("hello");  
	        buffer.append("java");  
	        System.out.println(buffer); //hellojava 
	        
	        StringBuilder builder=new StringBuilder("hello");  
	        builder.append("java");  
	        System.out.println(builder);  //hellojava
	        
	        
	        String str = new String("Hello how are you");
	        StringBuffer sb = new StringBuffer(str);
	        String str2 = sb.reverse().toString();
	        System.out.println(str2);//uoy era woh olleH

	     
	}

}
