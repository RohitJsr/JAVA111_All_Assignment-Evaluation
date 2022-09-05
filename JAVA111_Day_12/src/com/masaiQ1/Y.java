package com.masaiQ1;

public interface Y {
    void heightDisplayY();
    
    public default void displayY() {
        System.out.println("display method of Interface Y");
     }
    
    static void helloY()
    {
        System.out.println("Hello, New Static Method Here(Y)");
    }
}
