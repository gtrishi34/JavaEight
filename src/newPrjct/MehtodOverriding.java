package newPrjct;

class a{
	public void a1() {
		System.out.println("hi");
	}
	
//	public void aa() {
//		System.out.println("hi hi");
//	}
	
}

class b extends a{
	public void a1() {
		System.out.println("hello");
	}
}

public class MehtodOverriding {

	public static void main(String[] args) {
		
		b r = new b();
		r.a1();
		//r.aa();
		
	}
}
