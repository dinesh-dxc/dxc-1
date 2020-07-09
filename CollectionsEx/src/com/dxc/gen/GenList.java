package com.dxc.gen;

import java.util.ArrayList;
import java.util.List;

public class GenList {
	public static void main(String[] args) {
		List<String> names = new ArrayList<String>();
		names.add("Raj");
		names.add("Narayani");
		names.add("Aniruddha");
		names.add("Vennela");
		System.out.println("Names");
		for (String s : names) {
			System.out.println(s);
		}
	}
}
