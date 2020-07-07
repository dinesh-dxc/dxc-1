package com.dxc.java;

public class StEx {
	void show() {
		System.out.println("From Show Method...");
	}
	static void display() {
		System.out.println("From Display Method...");
	}
	public static void main(String[] args) {
		StEx.display();
		StEx obj = new StEx();
		obj.show();
	}
}
