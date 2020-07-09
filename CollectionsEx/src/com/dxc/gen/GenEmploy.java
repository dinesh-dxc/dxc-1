package com.dxc.gen;

import java.util.ArrayList;
import java.util.List;

public class GenEmploy {
	public static void main(String[] args) {
		List<Employ> employs = new ArrayList<Employ>();
		employs.add(new Employ(1, "Afrin", 88665));
		employs.add(new Employ(3, "Siva", 88434));
		employs.add(new Employ(4, "Annapurna", 88955));
		employs.add(new Employ(5, "Vidhya", 89224));
		employs.add(new Employ(6, "Supriya", 88295));
		//employs.add("Hello");
		System.out.println("List of Employees are  ");
		for (Employ e : employs) {
			System.out.println(e);
		}
	}
}
