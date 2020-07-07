package com.dxc.java;

public class OverloadEx {
	public void show(int x) {
		System.out.println("Integer " +x);
	}
	public void show(double x) {
		System.out.println("Double " +x);
	}
	public void show(String x) {
		System.out.println("String " +x);
	}
	public static void main(String[] args) {
		OverloadEx obj = new OverloadEx();
		obj.show(12);
		obj.show(12.5);
		obj.show("Welcome");
	}
}
