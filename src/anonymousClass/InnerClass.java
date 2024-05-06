package anonymousClass;

public interface InnerClass {
	
	 void prnt();
		
	
	public static void main(String[] args) {
		
		InnerClass innerclass = new InnerClass() {
			
			@Override
			public void prnt() {
				System.out.println("inner class is printed");
			}
		};
		innerclass.prnt();
	}

}
