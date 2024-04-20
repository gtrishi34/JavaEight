package newPrjct;

public class factorialPrjct {
  
	/*
	static int fact(int n) {
		
		if(n==0) 
			return 1;
		
		return n*fact(n-1);
		}
	
	public static void main(String[] args) {
	
		System.out.println(+fact(4));
	}

	*/
	
	
	public static void main(String[] args) {
		
	int b =1;
	int n =4;
		for(int i =1; i<= n-1; i++){
			
			b=b*(i+1);
		}
		System.out.println(+b);
	}
}
