package com.dxc.junit;

public class Demo {
	
	public int max3(int a, int b, int c) {
		int m = a;
		if (m < b) {
			m = b;
		}
		if (m < c) {
			m = c;
		}
		return m;
	}
	public int sub(int a, int b) {
		return a-b;
	}
	public int sum(int a, int b) {
		return a+b;
	} 
	
	public String sayHello() {
		return "Welcome to Junit...";
	}
}
