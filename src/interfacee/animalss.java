package interfacee;

public interface animalss {
	void sound();
}

 class cat implements animalss{
	 
	 @Override
	public void sound() {
		System.out.println("mew");
	}
	 
	 public static void main(String[] args) {
		
		 cat c = new cat();
		 c.sound();
	}

}
