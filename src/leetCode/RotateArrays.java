package leetCode;

import java.util.Arrays;

public class RotateArrays {


	    // Method to rotate the array to the right by k steps
	    public static void rotateRight(int[] arr, int k) {
	        int n = arr.length;
	        k %= n; // To handle cases where k > n
	        reverse(arr, 0, n - 1);
	        reverse(arr, 0, k - 1);
	        reverse(arr, k, n - 1);
	    }

	    // Method to rotate the array to the left by k steps
	    public static void rotateLeft(int[] arr, int k) {
	        int n = arr.length;
	        k %= n; // To handle cases where k > n
	        reverse(arr, 0, k - 1);
	        reverse(arr, k, n - 1);
	        reverse(arr, 0, n - 1);
	    }

	    // Helper method to reverse elements in the array from start to end
	    private static void reverse(int[] arr, int start, int end) {
	        while (start < end) {
	            int temp = arr[start];
	            arr[start] = arr[end];
	            arr[end] = temp;
	            start++;
	            end--;
	        }
	    }

	    public static void main(String[] args) {
	        // Define the array, number of steps to rotate, and direction of rotation
	        int[] arr = {1, 2, 3, 4, 5, 6, 7};
	        int k = 3;
	        String direction = "left";

	        // Print the original array
	        System.out.println("Original array: " + Arrays.toString(arr));

	        // Rotate and print the array based on direction
	        if (direction.equals("right")) {
	            rotateRight(arr, k);
	        } else if (direction.equals("left")) {
	            rotateLeft(arr, k);
	        } else {
	            System.out.println("Invalid direction!");
	            return;
	        }

	        // Output the rotated array
	        System.out.println("Rotated array: " + Arrays.toString(arr));
	    }
	}
	
