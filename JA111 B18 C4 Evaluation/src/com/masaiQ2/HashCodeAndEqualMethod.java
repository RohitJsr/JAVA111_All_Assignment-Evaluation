package com.masaiQ2;

public class HashCodeAndEqualMethod {
	/*

Hashcode – Hashcode returns a unique integer value for the object in runtime.
By default, integer value is derived from memory address of the object in heap 
(but it’s not mandatory). The object’s hash code is used for determining the 
index location, when this object needs to be stored in some HashTable like 
data structure.

	 public static void main(String... equalsExplanation) {
	        System.out.println(new Simpson("Homer", 35, 120)
	                 .equals(new Simpson("Homer",35,120)));
	        
	        System.out.println(new Simpson("Bart", 10, 120)
	                 .equals(new Simpson("El Barto", 10, 45)));
	        
	        System.out.println(new Simpson("Lisa", 54, 60)
	                 .equals(new Object()));
	    }
		
	    static class Simpson {

	        private String name;
	        private int age;
	        private int weight;

	        public Simpson(String name, int age, int weight) {
	            this.name = name;
	            this.age = age;
	            this.weight = weight;
	        }

	        @Override
	        public boolean equals(Object o) {
	            if (this == o) {
	                return true;
	            }
	            if (o == null || getClass() != o.getClass()) {
	                return false;
	            }
	            Simpson simpson = (Simpson) o;
	            return age == simpson.age &&
	                    weight == simpson.weight &&
	                    name.equals(simpson.name);
	        }

	    }


	}
	
	
	
Equals –  Equals verifies the equality of two objects. Its default implementation
 simply checks the object references of two objects to verify their equality.
By default, two objects are equal if and only if they are refer to the same
 memory location. Most Java classes override this method to provide their
  own comparison logic.
  
  
    public static void main(String... hashcodeExample) {
        Simpson homer = new Simpson(1, "Homer");
        Simpson bart = new Simpson(2, "Homer");

        boolean isHashcodeEquals = homer.hashCode() == bart.hashCode();

        if (isHashcodeEquals) {
            System.out.println("Should compare with equals method too.");
        } else {
            System.out.println("Should not compare with equals method because " +
                    "the id is different, that means the objects are not equals for sure.");
        }
    }

     static class Simpson {
        int id;
        String name;

        public Simpson(int id, String name) {
            this.id = id;
            this.name = name;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Simpson simpson = (Simpson) o;
            return id == simpson.id &&
                    name.equals(simpson.name);
        }

        @Override
        public int hashCode() {
            return id;
        }
    }


*/
	
}


