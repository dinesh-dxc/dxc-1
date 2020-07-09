package com.dxc.col;

import java.util.LinkedHashSet;
import java.util.Set;

public class HSetDemo {

	public static void main(String[] args) {
		Set s = new LinkedHashSet();
		s.add("Prakash");
		s.add("Shankara");
		s.add("Shwetha");
		s.add("Harshitha");
		s.add("Sanil");
		s.add("Mohammad");
		s.add("Keerthana");
		
		s.add("Prakash");
		s.add("Shankara");
		s.add("Shwetha");
		s.add("Harshitha");
		s.add("Sanil");
		s.add("Mohammad");

		s.add("Prakash");
		s.add("Shankara");
		s.add("Shwetha");
		s.add("Harshitha");
		s.add("Sanil");
		s.add("Mohammad");

		s.add("Shankara");
		s.add("Shwetha");
		s.add("Harshitha");
		s.add("Sanil");
		s.add("Mohammad");
		s.add("Keerthana");

		s.add("Shankara");
		s.add("Shwetha");
		s.add("Harshitha");
		s.add("Sanil");
		s.add("Mohammad");
		s.add("Keerthana");

		s.add("Shankara");
		s.add("Shwetha");
		s.add("Harshitha");
		s.add("Sanil");
		s.add("Mohammad");
		s.add("Keerthana");

		System.out.println("Names are");
		for (Object ob : s) {
			System.out.println(ob);
		}
	}
}
