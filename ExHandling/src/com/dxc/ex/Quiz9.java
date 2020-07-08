package com.dxc.ex;

public class Quiz9 {
	public void show(int x) {
		System.out.println("int " +x);
	}
	public void show(Integer x) {
		System.out.println("Integer  " +x);
	}
	public void show(Object x) {
		System.out.println("Object " +x);
	}
	public static void main(String[] args) {
		Quiz9 obj = new Quiz9();
		obj.show(new Integer(12));
	}
}
