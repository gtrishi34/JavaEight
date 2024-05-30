package leetCode;

public class ReverseString {

	    public static void main(String[] args) {
	        String original = "Hello!";
	        char[] chars = original.toCharArray();
	        int length = chars.length;
	        char[] reversed = new char[length];
	        for (int i = 0; i < length; i++) {
	            reversed[i] = chars[length - 1 - i];
	        }
	        System.out.println("Reversed string: " + new String(reversed));
	    }
	}

