package com.dxc.java;

public class Overload {
	public int sum() {
		return 5;
	}
	public int sum(int x) {
		return x+5;
	}
	public int sum(int x, int y) {
		return x+y;
	}
	public static void main(String[] args) {
		Overload obj1 = new Overload();
		System.out.println("Sum " +obj1.sum());
		System.out.println("Sum  " +obj1.sum(8));
		System.out.println("Sum  " +obj1.sum(8, 11));
	}
}
