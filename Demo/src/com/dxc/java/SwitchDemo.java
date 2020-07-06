package com.dxc.java;

public class SwitchDemo {
	public void check(int n) {
		switch(n) {
		case 1 : 
			System.out.println("Hi I am Abdul...");
			break;
		case 2 : 
			System.out.println("Hi I am Affrin...");
			break;
		case 3 : 
			System.out.println("Hi i am Annapurna...");
			break;
		case 4 :
			System.out.println("Hi I am Raj...");
			break;
		case 5 : 
			System.out.println("Hi I am Madhura...");
			break;
		default : 
			System.out.println("Invalid Choice...");
			break;
		}
	}
	public static void main(String[] args) {
		int n=6;
		SwitchDemo obj = new SwitchDemo();
		obj.check(n);
	}
}
