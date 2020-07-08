package com.dxc.ex;

public class Quiz7 {
	public void show(int x) {
		System.out.println("Integer " +x);
	}
	public void show(Object x) {
		System.out.println("Object " +x);
	}
	public static void main(String[] args) {
		Quiz7 obj = new Quiz7();
		obj.show(12);
	}
}
