package leetCode;

import java.util.Arrays;
import java.util.Collections;

public class SortArraysRev {

	

    public static Integer[] reverseSortArray(Integer[] arr) {
        Arrays.sort(arr, Collections.reverseOrder());
        return arr;
    }

    public static void main(String[] args) {
        Integer[] arr = {3, 1, 4, 1, 5, 9, 6, 5};
       
        System.out.println(Arrays.toString(reverseSortArray(arr)));  // Output: [9, 6, 5, 5, 5, 4, 3, 3, 2, 1, 1]
    }
}

