package com.masaiQ1;

public interface X {
	
    void heightDisplayX();
    
    public default void displayX() {
        System.out.println("display method of Interface X");
     }
    
    static void hello()
    {
        System.out.println("Hello, New Static Method Here(X)");
    }
}
