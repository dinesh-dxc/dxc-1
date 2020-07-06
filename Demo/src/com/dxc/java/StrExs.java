package com.dxc.java;

public class StrExs {
	public void show() {
		String str="Harshita,Keerthana,Madhura,Narendra,Pranjali,Shankara";
		String[] names = str.split(",");
		for (String s : names) {
			System.out.println(s);
		}
	}
	public static void main(String[] args) {
		StrExs obj = new StrExs();
		obj.show();
	}
}
