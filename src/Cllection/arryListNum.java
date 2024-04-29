package Cllection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class arryListNum {

	
	public static void main(String[] args) {
		
		List<Integer> age = new ArrayList<>();
		
		age.add(45);
		age.add(40);
		age.add(13);
		age.add(21);
		
		
		List<Integer> ag = age.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
		
		System.out.println(ag);
		System.out.println("max age : " +age.stream().max(Integer::compareTo).get());
	}
}
