package com.dxc.ex;

public class Quiz8 {
	public void show(double x) {
		System.out.println("Double " +x);
	}
	public void show(Object x) {
		System.out.println("Object " +x);
	}
	public static void main(String[] args) {
		Quiz8 obj = new Quiz8();
		obj.show(12);
	}
}
