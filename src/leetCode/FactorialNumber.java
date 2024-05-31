package leetCode;

public class FactorialNumber {
	
	public static int fact(int count) {
		
		if(count==0||count ==1) {
			return 1;
				
		}
		 return count*fact(count-1);
	}

	public static void main(String[] args) {

		System.out.println(fact(5));
	}}


