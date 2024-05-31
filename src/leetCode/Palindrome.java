package leetCode;

public class Palindrome {

	
	    public static boolean isPalindrome(String s) {
	        // Convert the string to lowercase and remove non-alphanumeric characters
	        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
	        
	        // Check if the string is a palindrome
	        int left = 0, right = s.length() - 1;
	        while (left < right) {
	            if (s.charAt(left) != s.charAt(right)) {
	                return false;
	            }
	            left++;
	            right--;
	        }
	        return true;
	    }

	    public static void main(String[] args) {
	        String str1 = "A man, a plan, a canal: Panama";
	        String str2 = "race a car";

	        System.out.println("\"" + str1 + "\" is a valid palindrome: " + isPalindrome(str1));
	        System.out.println("\"" + str2 + "\" is a valid palindrome: " + isPalindrome(str2));
	    }
	
}
