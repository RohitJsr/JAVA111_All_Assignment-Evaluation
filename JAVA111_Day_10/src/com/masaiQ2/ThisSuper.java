package com.masaiQ2;

public class ThisSuper {
	
	/*
	 This:- 1)this keyword mainly
	  represents the current instance of a class.
	  2)this keyword used to call default constructor 
	  of the same class.
	  3)this keyword used to access methods of the current 
	  class as it has reference of current class.
	  
	  Super:-1)On other hand super keyword represents the current 
	  instance of a parent class.
	  2)On other hand super keyword represents the current instance 
	  of a parent class.
	  3)On other hand super keyword represents the current instance 
	  of a parent class.
	 
	 Example:-class A {
   public int x, y;
   public A(int x, int y) {
      this.x = x;
      this.y = y;
   }
}
class B extends A {
   public int x, y;
   public B() {
      this(0, 0);
   }
   public B(int x, int y) {
      super(x + 1, y + 1);// calls parent class constructor
      this.x = x;
      this.y = y;
   }
   public void print() {
      System.out.println("Base class : {" + x + ", " + y + "}");
      System.out.println("Super class : {" + super.x + ", " + super.y + "}");
   }
}
class Point {
   public static void main(String[] args) {
      B obj = new B();
      obj.print();
      obj = new B(1, 2);
      obj.print();
   }
}
	 */

}
