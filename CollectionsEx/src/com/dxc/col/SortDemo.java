package com.dxc.col;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortDemo {
	public static void main(String[] args) {
		SortedSet names = new TreeSet();
		names.add("Prakash");
		names.add("Shankara");
		names.add("Shwetha");
		names.add("Harshitha");
		names.add("Sanil");
		names.add("Abdul");
		names.add("Sajeed");
		names.add("Mohammad");
		names.add("Keerthana");
		
		System.out.println("Names are ");
		for (Object ob : names) {
			System.out.println(ob);
		}
	}
}
