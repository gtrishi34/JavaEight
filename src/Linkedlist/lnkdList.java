package Linkedlist;

import java.util.LinkedList;
import java.util.List;

public class lnkdList {

	public static void main(String[] args) {
		
		List<Integer>sal = new LinkedList<>();
		
		sal.add(200);
		sal.add(300);
		sal.add(500);
		sal.add(400);
		sal.add(900);
		
		System.out.println(sal.indexOf(500));
		System.out.println(sal.get(4));
		
		for(int e : sal) {
			System.out.println(e);
		}
	}
}
