package leetCode;

	import java.util.HashSet;
	import java.util.Set;
	import java.util.Arrays;

	public class IntersectionArrays {

	    public static int[] intersection(int[] arr1, int[] arr2) {
	        Set<Integer> set1 = new HashSet<>();
	        Set<Integer> intersectionSet = new HashSet<>();
	        
	        // Add elements of arr1 to the set
	        for (int num : arr1) {
	            set1.add(num);
	        }

	        // Check elements of arr2 against set1 and add to intersectionSet if present
	        for (int num : arr2) {
	            if (set1.contains(num)) {
	                intersectionSet.add(num);
	            }
	        }

	        // Convert the intersectionSet to an array
	        int[] result = new int[intersectionSet.size()];
	        int i = 0;
	        for (int num : intersectionSet) {
	            result[i++] = num;
	        }

	        return result;
	    }

	    public static void main(String[] args) {
	        int[] arr1 = {1,3,4,5, 2, 1};
	        int[] arr2 = {2,5,6};

	        int[] result = intersection(arr1, arr2);

	        System.out.println("Array 1: " + Arrays.toString(arr1));
	        System.out.println("Array 2: " + Arrays.toString(arr2));
	        System.out.println("Intersection: " + Arrays.toString(result));
	    }
	}
