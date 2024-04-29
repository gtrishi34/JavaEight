package newPrjct;

public class MyClass {
	 public void nonStaticMethod() {
	        System.out.println("This is a non-static method");
	    }

	    // Static method
	    public static void staticMethod() {
	        System.out.println("This is a static method");
	    }

	    public static void main(String[] args) {
	        // Create an object of MyClass
	        MyClass obj = new MyClass();

	        // Call the non-static method using the object
	        obj.nonStaticMethod(); // Output: This is a non-static method

	        // Call the static method using the class name
	        MyClass.staticMethod(); // Output: This is a static method

	        // It's also possible to call a static method using an object reference,
	        // but it's considered bad practice and should be avoided.
	        obj.staticMethod(); // Output: This is a static method
	    }

}
