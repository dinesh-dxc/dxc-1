package com.dxc.java;

public class LoopEx {
	public void show(int n, String name) {
		int i = 0;
		while(i < n) {
			System.out.println("Welcome to Java");
			if (name=="Abdul") {
				i+=2;
			} else {
				i++;
			}
		}
	}
	public static void main(String[] args) {
		int n=5;
		LoopEx obj = new LoopEx();
		obj.show(n, "Raj");
	}
}
