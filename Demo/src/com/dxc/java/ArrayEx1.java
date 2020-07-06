package com.dxc.java;

public class ArrayEx1 {
	public void show() {
		int[] a = new int[] {5,98,45,66,23};
		for (int i : a) {
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
		ArrayEx1 obj = new ArrayEx1();
		obj.show();
	}
}
