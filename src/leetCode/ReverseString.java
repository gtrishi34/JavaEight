package leetCode;

public class ReverseString {
	
	    public static void main(String[] args) {
	    	
	    	// using string builder
//	    	String s ="xyz12";
//			
//			String rs = new StringBuilder(s).reverse().toString();
//			
//			System.out.println(rs);
	    	
	        String original = "Hello!";
	        char[] chars = original.toCharArray();
	        System.out.println(chars);
	        
	        int length = chars.length;
	        System.out.println(length);
	        
	        char[] reversed = new char[length];
	        System.out.println(reversed);
	        
	        for (int i = 0; i < length; i++) {
	            reversed[i] = chars[length - 1 - i];
	        }
	        
	        System.out.println("Reversed string: " + new String(reversed));
	    }
	}

