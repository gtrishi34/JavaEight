package Upcasting;

public class Anmal {

	  void sound() {
	        System.out.println("Animal makes a sound");
	    }
	}

	class Dog extends Anmal {
	    @Override
	    void sound() {
	        System.out.println("Dog barks");
	    }

	    void wagTail() {
	        System.out.println("Dog wags tail");
	    }
	
	    public static void main(String[] args) {
	        // Upcasting: Subclass object to superclass reference
	        Anmal animal = new Dog(); // Upcasting
	        Dog ani = new Dog();
	        
	        // Method call
	        animal.sound(); // Calls overridden method from Dog class
	        ani.wagTail(); //no overridden method from Dog class so no upcasting
	       

	        // Compilation error: animal.wagTail(); 
	        // Animal reference cannot access subclass-specific methods
	    }
	}


