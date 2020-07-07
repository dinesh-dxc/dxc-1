package com.dxc.java;

public class Test {
	int a, b;
	Test() {
		a=5;
		b=7;
	}
	Test(int a) {
		this.a=a;
		b=7;
	}
	Test(int a, int b) {
		this.a=a;
		this.b=b;
	}
	
	@Override
	public String toString() {
		return "Test [a=" + a + ", b=" + b + "]";
	}
	public static void main(String[] args) {
		Test obj1 = new Test();
		System.out.println(obj1);
		Test obj2 = new Test(78);
		System.out.println(obj2);
		Test obj3 = new Test(72, 15);
		System.out.println(obj3);
	}
}
