package rough;

public class Superclas {
	
	
	
	public static void main(String[] args) {
		
		int[] a = {1,2,3};
		
		int t = 5;
		
		for(int i = 0;i<a.length; i++){
			for(int j = 1;j<a.length; j++){
				
				if(a[i]+a[j]== t) {
					System.out.println(a[i]+" " +a[j]);
				}
				
			}
		}
		
	}
	}

