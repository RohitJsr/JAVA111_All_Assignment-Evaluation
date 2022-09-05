package com.masaiQ3;

public class EqualsAndHashcode {
//	hashCode() is a method of Object class. Hash code is an integer representation of an object by JVM.
//
//	Hash code is system generated using some formula (let us not go much of detais of formula).
//
//	Hash codes generated need not be the same for different times of execution. Internally, the objects are stored in Hashtable format.
//
//	The equals() method, as we know earlier, compares two strings or characters.
//
//	For comparison, the JVM uses their hash codes only. This way of comparison is
//
//	very faster than comparing each character in the two strings.
//
//	This hash code format cannot be used by the programmer in coding.
//
//	equals() is a method of Object class. This method is not designed to exactly compare the properties of two objects,but designed, to know whether two references refer the same object or not.
//
//	Many classes override this method for their convenience.
//
//	String and System classes has overridden this method to know two objects are same or not.
//
//	Just Test look into the picture with the help of following program:



	public static void main(String args[]){

		EqualsAndHashcode t1 = new EqualsAndHashcode();

		EqualsAndHashcode t2 = new EqualsAndHashcode();

	System.out.println(t1.getClass());

	int a = t1.hashCode();

	int b = t2.hashCode();

	System.out.println("t1 object hash code: " + a);

	System.out.println("t2 object hash code: " + b);

	if(t1.equals(t2))

	System.out.println("t1 and t2 refers the same");

	else

	System.out.println("t1 and t2 does not refer the same");

	EqualsAndHashcode t3, t4;

	t3 = t1;

	t4 = t1;

	if(t3.equals(t4))

	System.out.println("t3 and t4 refers the same");

	else

	System.out.println("t3 and t4 does not refer the same");

	}

	}

