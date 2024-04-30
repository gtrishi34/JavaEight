package Dwncasting;

public class Aimal {
	
	
	    void sound() {
	        System.out.println("Animal makes a sound");
	    }
	}

	class Dog extends Aimal {
	    @Override
	    void sound() {
	        System.out.println("Dog barks");
	    }

	    void wagTail() {
	        System.out.println("Dog wags tail.");
	    }
	


	    public static void main(String[] args) {
	        // Upcasting: Subclass object to superclass reference
	    	Aimal animal = new Dog(); // Upcasting

	        // Attempting to downcast without instanceof check
	        // Dog dog = (Dog) animal; // Compile-time error: Dog cannot be cast to Animal

	        // Downcasting with instanceof check
	        if (animal instanceof Dog) {
	            Dog dog = (Dog) animal; // Downcasting
	            dog.sound(); // Calls overridden method from Dog class
	            dog.wagTail(); // Calls method specific to Dog class
	        } else {
	            System.out.println("Animal is not a Dog");
	        }
	    }
	}



