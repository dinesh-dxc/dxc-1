package com.dxc.java;

public class Quiz4 {
	int n;
	public static void main(String[] args) {
		Quiz4 obj1 = new Quiz4();
		obj1.n = 12;
		Quiz4 obj2 = obj1;
		obj2.n = 13;
		System.out.println(obj1.n);
		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());
	}
}
