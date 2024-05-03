package map;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;

public class linkedHashMap {

	public static void main(String[] args) {
		
		Map<String, Integer> lnkdmap = new LinkedHashMap<>();
		
		lnkdmap.put("xyz",500);
		lnkdmap.put("abc", 1500);
		lnkdmap.put("bhx", 1200);
		lnkdmap.put("rgc",1300);
		
		for(Map.Entry<String, Integer> e : lnkdmap.entrySet()) {
			
			System.out.println(e.getKey()+ " : " +e.getValue());
		}
		
		System.out.println(lnkdmap.values().stream().max(Comparator.naturalOrder()).orElse(Integer.MIN_VALUE));

	}

}
