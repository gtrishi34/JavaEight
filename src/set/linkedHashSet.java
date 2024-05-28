package set;

import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class linkedHashSet {

	public static void main(String[] args) {
		
		Set<Integer> lnkset = new LinkedHashSet<>();
		
		lnkset.add(45);
		lnkset.add(58);
		lnkset.add(25);
		lnkset.add(12);
		lnkset.add(58);
		
		System.out.println(lnkset);
		
		System.out.println(lnkset.stream().max(Comparator.naturalOrder()).orElse(null));
		
		System.out.println(lnkset.stream().sorted().collect(Collectors.toList()));
		
		System.out.println(lnkset.stream().sorted((a,b)->b-a).collect(Collectors.toList()));
		
		
	}
	
}
