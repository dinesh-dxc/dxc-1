package com.dxc.jdk8;

import java.util.ArrayList;
import java.util.List;

public class Example4 {
	public static void main(String[] args) {
		List<Employ> employs = new ArrayList<Employ>();
		employs.add(new Employ(1, "Sumit", 88234));
		employs.add(new Employ(2, "Abdul", 77333));
		employs.add(new Employ(3, "Raj", 89734));
		employs.add(new Employ(4, "Shweta", 82855));
		employs.add(new Employ(5, "Snehal", 89034));
		employs.add(new Employ(6, "Vennela", 82345));
		employs.forEach(System.out::println);
	}
}
