package map;

import java.util.HashMap;
import java.util.Map;

public class HshMap {

	public static void main(String[] args) {

Map<String, Integer> emp = new HashMap<>();

emp.put("rishi", 4000);
emp.put("sohan", 2500);
emp.put("abhi", 3300);
emp.put("john", 4000);

int rishiSal = emp.get("rishi");
System.out.println("rishi salary is : "+ rishiSal);

for(Map.Entry<String, Integer> e : emp.entrySet()){
	
	System.out.println(e.getKey()+e.getValue());
	
	 int max = emp.values().stream()
             .mapToInt(Integer::intValue)
             .max()
             .orElse(Integer.MIN_VALUE);
	 
	 System.out.println("maximum salary :" +max);
	
}
}
}