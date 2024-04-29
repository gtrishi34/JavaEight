package rough;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class run {

	public static void main(String[] args) {
	
		List<tv> telev = new ArrayList<>();
		
		telev.add(new tv("sony", 5000000, 85, 2020));
		telev.add(new tv("mi", 190000, 65, 2024));
		telev.add(new tv("lg", 200000, 55, 2021));
		
		Comparator<tv>  comm = new Comparator<tv>() {
			
			@Override
			public int compare(tv o1, tv o2) {
				if(o1.getPrice()>o2.getPrice())
					return 1;
				else
					return -1;
			}
		};
		
		Collections.sort(telev,comm);
		
for(tv t:telev)	{
	System.out.println(t);
}
		
	}

}
