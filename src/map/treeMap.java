package map;

import java.awt.RenderingHints.Key;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class treeMap {

	public static void main(String[] args) {
		
		TreeMap<String, Integer> emp = new TreeMap<>();
		
		emp.put("cbvf", 500);
		emp.put("bgx", 600);
		emp.put("asb", 900);
		emp.put("xyz",800);
		
		System.out.println(emp);
		
		for(Map.Entry<String, Integer> e : emp.entrySet()) {
			
			System.out.println(e.getKey()+" : "+e.getValue());
		}
		
	}
	
}
