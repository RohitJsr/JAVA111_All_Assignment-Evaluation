public class Demo {
    public static void main(String[] args) {
        int a = 64;
        int b = 70;
        byte c = (byte)(a+b);//typecast (a+b) to byte
        System.out.println(c);
        }
        /*
        The process of converting data from higher data type to lower data type is called as Explicit Type
    Casting.
    To perform explicit type casting we have to use the following pattern.
    byte c = (byte)(a+b);;
       (byte) → Cast operator
    Where byte and (byte) are two primitive data types, where (byte) must be either same as byte or lower than byte .
         */
    }