package map;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ListToHashmp {

	
	public static void main(String[] args) {
		
		List<String> mylist = new ArrayList<>();
		
		mylist.add("apple");
		mylist.add("mango");
		mylist.add("pears");
		
				 mylist.forEach(e-> System.out.println(e));
				 
				 Map<Integer, String> newmap = mylist.stream().collect(Collectors.toMap(mylist::indexOf, e->e));
				 
				 System.out.println(newmap);
				 
	}
}
