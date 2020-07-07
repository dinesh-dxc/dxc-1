package com.dxc.java;

public class BoxEx {
	public void show(Object ob) {
		if (ob instanceof Integer) {
			System.out.println("Integer Casting...");
			int x = (Integer)ob;
		}
		if (ob instanceof Double) {
			System.out.println("Double Casting...");
			double x = (Double)ob;
		}
		if (ob instanceof String) {
			System.out.println("String Casting...");
			String x = (String)ob;
		}
	}
	public static void main(String[] args) {
		int x=12;
		double b=12.5;
		String name="Hello";
		BoxEx obj = new BoxEx();
		obj.show(x);
		obj.show(b);
		obj.show(name);
	}
}
