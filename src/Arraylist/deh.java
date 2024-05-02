package Arraylist;

import java.util.ArrayList;
import java.util.List;

public class deh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> age = new ArrayList<>();
		
		age.add(3);
		age.add(4);
		age.add(6);
		age.add(8);
		age.add(39);
		age.add(34);
		
		System.out.println(age.indexOf(8)); //finding index
		System.out.println(age.get(2));   //find the object at index
		
		for(int e : age) {
			System.out.println(e);
		}
	}

}
