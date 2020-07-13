package com.dxc.jdk8;

interface C1 {
	void show();
}

class Test {
	void greeting() {
		System.out.println("Welcome to JDK...");
	}
}
public class Example1 {
	public static void main(String[] args) {
		C1 obj = new Test()::greeting;
		obj.show();
	}
}
