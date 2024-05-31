package leetCode;

public class Fibonacci {
	
	/*
	public static void fib(int count) {
		int a = 0;
		int b = 1;
		int c = 1;
		 
		for(int i=1; i<=count; i++) {
			System.out.print(a+",");
		
			a=b;
			b=c;
			c=a+b;
		}
	}

	public static void main(String[] args) {
		fib(4);

	}
	*/
	
	   public static int fibonacci(int count) {
				if (count <= 1)
					return count;

				return fibonacci(count - 1) + fibonacci(count - 2);
			}

			public static void main(String args[]) {
		    	int seqLength = 6;

		    	System.out.print("A Fibonacci sequence of " + seqLength + " numbers: ");

		    	for (int i = 0; i < seqLength; i++) {
		      	    System.out.print(fibonacci(i) + " ");
		    	}
		  	}
}
