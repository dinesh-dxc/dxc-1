package com.dxc.jdk8;

import java.util.ArrayList;
import java.util.List;

public class Lambda5 {
	public static void main(String[] args) {
		List<Employ> employs = new ArrayList<Employ>();
		employs.add(new Employ(1, "Sumit", 88234));
		employs.add(new Employ(2, "Abdul", 77333));
		employs.add(new Employ(3, "Raj", 77666));
		employs.add(new Employ(4, "Shweta", 82855));
		employs.add(new Employ(5, "Snehal", 89034));
		employs.add(new Employ(6, "Vennela", 82345));
		
		System.out.println(employs.stream().count());
		
		System.out.println(employs.stream().findFirst());
		
		employs.stream().limit(3).forEach(System.out::println);
		
	}
}
