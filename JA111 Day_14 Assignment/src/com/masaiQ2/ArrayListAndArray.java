package com.masaiQ2;

public class ArrayListAndArray {
	public static void main(String[] args) {
		/*
		 Java Array:--
		An array is a dynamically-created object. It serves as a container 
		that holds the constant number of values of the same type. It has a 
		ontiguous memory location. Once an array is created, we cannot change 
		its size. We can create an array by using the following statement:
		
		int array[]=new int[size];  
		The above statement creates an array of the specified size. When we try 
		to add more than its size, it throws ArrayIndexOutOfBoundsException. For example:
		Example:--int arr[]=new int[3];   //specified size of array is 3  
		//adding 4 elements into array   
		arr[0]=12;  
		arr[1]=2;  
		arr[2]=15;  
		arr[3]=67;  
		
		
		Java ArrayList class:--
		In Java, ArrayList is a class of Collections framework. It implements List<E>, Collection<E>,
		 Iterable<E>, Cloneable, Serializable, and RandomAccess interfaces. It extends AbstractList<E> class.
		We can create an instance of ArrayList by using the following statement:

		ArrayList<Type> arrayList=new ArrayList<Type>();  
		ArrayList is internally backed by the array in Java. The resize operation in ArrayList slows down
		 the performance as it involves new array and copying content from an old array to a new array. It 
		 calls the native implemented method System.arraycopy(sec, srcPos, dest, destPos, length) .
		
		We cannot store primitive type in ArrayList. So, it stores only objects. It automatically 
		converts primitive type to object. For example, we have create an ArrayList object,
		
		ArrayList <Integer> list=new ArrayList<Integer>();  //object of ArrayList  
		arrayObj.add(12);   //trying to add integer primitive to the ArrayList  
		The JVM converts it into Integer object through auto-boxing.
		
		ArrayList arrayObj=new ArrayList()//object of ArrayList  
		arrayObj(new Integer(12)); //converts integer primitive to Integer object and added to ArrayList object  
		 */
	}

}
