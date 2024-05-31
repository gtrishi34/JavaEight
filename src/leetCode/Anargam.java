package leetCode;

import java.util.Arrays;

public class Anargam {


	    public static boolean areAnagrams(String str1, String str2) {
	        // Remove spaces and convert strings to lowercase
	        str1 = str1.replaceAll("\\s", "").toLowerCase();
	        str2 = str2.replaceAll("\\s", "").toLowerCase();

	        // If lengths are different, they cannot be anagrams
	        if (str1.length() != str2.length()) {
	            return false;
	        }

	        // Convert strings to char arrays and sort them
	        char[] charArray1 = str1.toCharArray();
	        char[] charArray2 = str2.toCharArray();
	        Arrays.sort(charArray1);
	        Arrays.sort(charArray2);

	        // Compare sorted char arrays
	        return Arrays.equals(charArray1, charArray2);
	    }

	    public static void main(String[] args) {
	        String str1 = "listen";
	        String str2 = "silent";

	        if (areAnagrams(str1, str2)) {
	            System.out.println(str1 + " and " + str2 + " are anagrams.");
	        } else {
	            System.out.println(str1 + " and " + str2 + " are not anagrams.");
	        }
	    }
	}
