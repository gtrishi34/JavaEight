package set;

import java.util.LinkedHashSet;
import java.util.Set;

public class linkedHashSet {

	public static void main(String[] args) {
		
		Set<Integer> lnkset = new LinkedHashSet<>();
		
		lnkset.add(45);
		lnkset.add(58);
		lnkset.add(25);
		lnkset.add(12);
		lnkset.add(58);
		
		System.out.println(lnkset);
		
	}
	
}
