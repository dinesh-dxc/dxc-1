package com.dxc.jdk8;

interface IOperation {
	int calc(int a, int b);
}
public class Lambda2 {
	public static void main(String[] args) {
		IOperation ob1 = (a, b) -> {
			int c=a+b;
			return c;
		};
		
		IOperation ob2 = (a,b) -> {
			return a-b;
		};
		
		IOperation ob3 = (a,b) -> {
			return a*b;
		};
		
		System.out.println(ob1.calc(12, 5));
		System.out.println(ob2.calc(12, 5));
		System.out.println(ob3.calc(12, 5));
	}
}
