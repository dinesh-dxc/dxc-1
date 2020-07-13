package com.dxc.jdk8;

interface ICalc {
	int calc(int a,int b);
}

class Calc1 {
	public int add(int a, int b) {
		return a+b;
	}
}

class Calc2 {
	public int sub(int a, int b) {
		return a-b;
	}
}

class Calc3 {
	public int mult(int a, int b) {
		return a*b;
	}
}
public class Example2 {
	public static void main(String[] args) {
		ICalc obj = new Calc1()::add;
		System.out.println("Sum is  " +obj.calc(12, 5));
		
		ICalc obj2 = new Calc2()::sub;
		System.out.println("Sub is  " +obj2.calc(12, 5));
		
		ICalc obj3 = new Calc3()::mult;
		System.out.println("Mult is  " + obj3.calc(12, 5));
		
	}
}
