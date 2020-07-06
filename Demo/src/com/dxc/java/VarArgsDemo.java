package com.dxc.java;

public class VarArgsDemo {
	public void show(String...names) {
		for (String s : names) {
			System.out.print(s + "  ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		VarArgsDemo obj = new VarArgsDemo();
		obj.show();
		obj.show("Pranjali");
		obj.show("Pranjali","Rutuja");
		obj.show("Shankara","Siva","Abdul","Raj");
	}
}
