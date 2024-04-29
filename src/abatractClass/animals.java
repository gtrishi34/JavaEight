package abatractClass;

abstract class animals{
	
	abstract void sound();
}
	
	 class cat extends animals{
		
		@Override
		void sound() {
			System.out.println("meew");
		}
		
	 
	 
	// public class Main{
	
	public static void main(String[] args) {
		
		cat c = new cat();
			
		c.sound();
	
	}
	}
	 
