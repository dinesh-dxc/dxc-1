package com.dxc.jdk8;

interface IGreeting {
	void greet(); 
}

//class Sumit implements IGreeting {
//
//	@Override
//	public void greet() {
//		System.out.println("Good Morning from Sumit...");
//	}
//	
//}
//
//class Supriya implements IGreeting {
//
//	@Override
//	public void greet() {
//		System.out.println("Hi I am Supriya...");
//	}
//	
//}
public class Lambda1 {
	public static void main(String[] args) {
		IGreeting obj1 = () -> {
			System.out.println("Good Morning from Sumit...");
		};
		
		IGreeting obj2 = () -> {
			System.out.println("Good Morning from Supriya...");
		};
		obj1.greet();
		obj2.greet();
	}
}
