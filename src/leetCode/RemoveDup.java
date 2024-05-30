package leetCode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.IntStream;

public class RemoveDup {

	public static void main(String[] args) {
		
//		int[] arr = {1,2,3,2,4};
//		int[] arr1 = IntStream.of(arr).distinct().toArray();
//		System.out.println(Arrays.toString(arr1));
		
		//using set
		
		int[]arr2 = {2,2,7,3,3,4,5,7,7,6};
		Set<Integer> set = new LinkedHashSet<>();
		
		for(int e:arr2) {
			set.add(e);
		}
			int[]arr3 = new int[set.size()];
			int index = 0;
			
					for(int e:set) {
						arr3[index++] = e;
		}
					System.out.println(Arrays.toString(arr3));
		
	}
}
