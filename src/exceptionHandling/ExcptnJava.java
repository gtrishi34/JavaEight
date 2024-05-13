package exceptionHandling;
//try catch
public class ExcptnJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 10;
		int b = 0;
		int c;
		
		try {
			c=a/b;
			System.out.println(c);
		}
		catch (Exception e) {
			System.out.println("cannot divide by zero");
		}
		
		String s = "rishi";
		int i = Integer.parseInt(s);
		System.out.println(i);
	}
}