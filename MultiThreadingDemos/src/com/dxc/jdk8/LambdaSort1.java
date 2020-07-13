package com.dxc.jdk8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LambdaSort1 {
	public static void main(String[] args) {
		List<Employ> employs = new ArrayList<Employ>();
		employs.add(new Employ(1, "Sumit", 88234));
		employs.add(new Employ(2, "Abdul", 77333));
		employs.add(new Employ(3, "Raj", 77666));
		employs.add(new Employ(4, "Shweta", 82855));
		employs.add(new Employ(5, "Snehal", 89034));
		employs.add(new Employ(6, "Vennela", 82345));
		
//		Collections.sort(lst,(e1,e2) -> {
//			return e1.name.compareTo(e2.name);
//		});
		
		Collections.sort(employs, (e1, e2) -> {
			return e1.getName().compareTo(e2.getName());
		});
		employs.forEach(System.out::println);
		
		Collections.sort(employs, (e1, e2) -> {
			return (int) (e1.getBasic() - e2.getBasic());
		});
		// Write code to sort by Basic-Wise 
		System.out.println("Sort By Salary Wise...");
		employs.forEach(System.out::println);
		
	}
}
