package exceptionHandling;



public class delimiter {

	public static void main(String[] args) {
		
	String dataStr = "name=John;age=30;city=New York";
	String[] parts = dataStr.split(";");
	
	for(String e: parts) {
	System.out.println(e);
	
	}  
}
}
