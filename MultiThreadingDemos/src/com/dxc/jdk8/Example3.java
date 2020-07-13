package com.dxc.jdk8;

import java.util.ArrayList;
import java.util.List;

public class Example3 {
	public static void main(String[] args) {
		List<String> names = new ArrayList<String>();
		names.add("Harshita");
		names.add("Afrin");
		names.add("Snehal");
		names.add("Sanil");
//		for (String s : names) {
//			System.out.println(s);
//		}
		names.forEach(System.out::println);
	}
}
