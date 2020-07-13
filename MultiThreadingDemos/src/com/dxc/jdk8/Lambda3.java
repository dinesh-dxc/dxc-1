package com.dxc.jdk8;

import java.util.ArrayList;
import java.util.List;

public class Lambda3 {
	public static void main(String[] args) {
		List<String> names = new ArrayList<String>();
		names.add("Harshita");
		names.add("Afrin");
		names.add("Snehal");
		names.add("Sanil");
	//	names.forEach(System.out::println);
//		for (String a : names) {
//			
//		}
		names.forEach( (a) -> 
			System.out.println(a)
			);
	}
}
