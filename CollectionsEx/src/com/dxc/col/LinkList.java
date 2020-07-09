package com.dxc.col;

import java.util.LinkedList;

public class LinkList {
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.add("Aniruddha");
		list.add("Annapurna");
		list.add("Vidhya");
		list.add("Supriya");
		list.add("Shweta");
		System.out.println("Names are  ");
		for (Object ob : list) {
			System.out.println(ob);
		}
		list.addFirst("Snehal");
		list.addLast("Srinivasan");
		System.out.println("Updated List");
		for (Object ob : list) {
			System.out.println(ob);
		}
	}
}
