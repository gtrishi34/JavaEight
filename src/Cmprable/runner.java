package Cmprable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class runner{
	
	public static void main(String[] args) {
		
	
 List<laptop> laps = new ArrayList<>();
 
 laps.add(new laptop("lenevo",230, 44));
 laps.add(new laptop("dell",200, 62));
 laps.add(new laptop("samsung", 700, 16));
 
 Collections.sort(laps);

	 for(laptop l :laps) {
		 
		 System.out.println(l);
	 }

	}

}
