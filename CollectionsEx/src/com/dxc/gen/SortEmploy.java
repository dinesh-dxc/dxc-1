package com.dxc.gen;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortEmploy {
	public static void main(String[] args) {
//		Comparator<Employ> c = new NameComparator();
		Comparator<Employ> c = new BasicComparator();
		SortedSet<Employ> employs = new TreeSet<Employ>(c);
		employs.add(new Employ(1, "Narendra", 88345));
		employs.add(new Employ(3, "Abdul", 81122));
		employs.add(new Employ(4, "Madhura",82445));
		employs.add(new Employ(5, "Madhura",88333));
		employs.add(new Employ(6, "Sajeed", 82344));
		for (Employ e : employs) {
			System.out.println(e);
		}
	}
}
