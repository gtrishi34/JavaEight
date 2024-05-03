package set;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

public class hshSet {

	public static void main(String[] args) {
		
		
		Set<Integer> age = new HashSet<>();
		
		age.add(25);
		age.add(35);
		age.add(25);
		age.add(36);
		
		System.out.println(age);
		age.remove(25);
		System.out.println(age);
		
		System.out.println(age.stream().max(Comparator.naturalOrder()).orElse(null));

	}

}
