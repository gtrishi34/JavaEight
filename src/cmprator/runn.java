package cmprator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class runn {

	public static void main(String[] args) {
		
		List<employee> emp = new ArrayList<>();
		
		emp.add(new employee("rishi", 28, 1000, 801105));
		emp.add(new employee("abhi", 24, 1500, 801116));
		emp.add(new employee("bharat", 26, 900, 801005));
		
		Comparator<employee> com = new Comparator<employee>() {
			
			@Override
			public int compare(employee o1, employee o2) {
				if(o1.getAge()>o2.getAge()) 
					return 1;
				
				else 
					return -1;
			}
			};
			
			Collections.sort(emp,com);
			
			for(employee e:emp) {
				System.out.println(e);
			}
		
		}	
	}

		
		
	
