package Cnstructor;

//use of super in constructor

public class SubAnimal extends Animal {
	
	public SubAnimal() {
		
		super("bear",30);
	}

	public static void main(String[] args) {
		
		SubAnimal bear = new SubAnimal();
		bear.disp();
	}
}
