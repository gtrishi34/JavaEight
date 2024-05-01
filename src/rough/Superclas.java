package rough;

public class Superclas {
	
	    int x;

	    Superclas(int x) {
	        this.x = x;
	    }
	}

	class Subclass extends Superclas {
	    int y;

	    Subclass(int x, int y) {
	        super(x); // Calling superclass constructor
	        this.y = y; // Initializing subclass-specific variable
	    }

	    void display() {
	        System.out.println("x from superclass: " + super.x);
	        System.out.println("y from subclass: " + this.y);
	    }
	
	public static class mn{
	    
	public static void main(String[] args) {
		

		 Subclass obj = new Subclass(10, 20);
	        obj.display();
	    }
	}
	}

