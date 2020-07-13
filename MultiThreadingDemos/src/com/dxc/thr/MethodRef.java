package com.dxc.thr;

interface IHello {
	void sayHello();
}

//class Test1 implements IHello {
//
//	@Override
//	public void sayHello() {
//		System.out.println("Welcome to Jdk 1.8 new Features...");
//	}
//	
//}
class Demo {
	public void greeting() {
		System.out.println("Welcome to Jdk 1.8 new Features...");
	}
}
public class MethodRef {
	public static void main(String[] args) {
		Demo obj = new Demo();
		IHello h = obj::greeting;
		h.sayHello();
	}
}
