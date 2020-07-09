package com.dxc.col;

import java.util.ArrayList;
import java.util.List;

public class ArrListDemo {
	public static void main(String[] args) {
		List names=new ArrayList();
		names.add("Afrin");
		names.add("Raj");
		names.add("Abdul");
		names.add("Prasanth");
		names.add(1);
		names.add(true);
		names.add(12.45);
		System.out.println("Names are ");
		for (Object ob : names) {
			System.out.println(ob);
		}
		names.add(2, "Vennala");
		System.out.println("List after adding new Element...");
		for (Object ob : names) {
			System.out.println(ob);
		}
		names.set(0, "Mohammad");
		System.out.println("List after modifying name...");
		for (Object ob : names) {
			System.out.println(ob);
		}
		names.remove(1);
		System.out.println("List after removing by Index");
		for (Object ob : names) {
			System.out.println(ob);
		}
		names.remove("Abdul");
		System.out.println("List after removing by Object Name");
		for (Object ob : names) {
			System.out.println(ob);
		}
	}
}
