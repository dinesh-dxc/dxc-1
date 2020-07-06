package com.dxc.java;

public class StrArray {
	public void show() {
		String[] names = new String[] {
			"Afrin", "Archana", 
			"Dinesh", "Narendra",
			"Nikitha"
		};
		for (String s : names) {
			System.out.println(s);
		}
	}
	public static void main(String[] args) {
		StrArray obj = new StrArray();
		obj.show();
	}
}
