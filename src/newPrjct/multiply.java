package newPrjct;

public class multiply {

	public static void main(String[] args) {
		
		int[] arr1 = {1,2,3};
		int[] arr2 = {1,2,3};
		
		int[] arr3 = new int[arr1.length];
		
		for(int i=0;i<=arr1.length-1; i++) {
			
			arr3[i] = arr1[i]*arr2[i];
		}
		for(int num: arr3) {
			System.out.print(+num +" ");
		}
	}
	
}
