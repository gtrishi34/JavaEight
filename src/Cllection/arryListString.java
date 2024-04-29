package Cllection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class arryListString {
	public static void main(String[] args) {
		
		ArrayList<String> emp = new ArrayList<>();
		
		emp.add("rishi");
		emp.add("xyz");
		emp.add("abhi");
		emp.add("vbc");
		
		for(String e: emp) {
			//System.out.println(e);
		}
			List<String>em = emp.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
			
			for (String x: em) {
				System.out.println(x);
			}
		}
	
	}