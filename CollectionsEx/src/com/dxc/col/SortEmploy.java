package com.dxc.col;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortEmploy {
	public static void main(String[] args) {
		//Comparator c = new NameComparator();
		Comparator c = new BasicComparator();
		SortedSet emps = new TreeSet(c);
		emps.add(new Employ(1, "Narendra", 88345));
		emps.add(new Employ(3, "Abdul", 81122));
		emps.add(new Employ(4, "Madhura",82445));
		emps.add(new Employ(5, "Madhura",88333));
		emps.add(new Employ(6, "Sajeed", 82344));
		for (Object ob : emps) {
			Employ e = (Employ)ob;
			System.out.println(e);
		}
	}
}
